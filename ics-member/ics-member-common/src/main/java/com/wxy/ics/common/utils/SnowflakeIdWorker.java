package com.wxy.ics.common.utils;




import com.wxy.ics.common.enums.SnowflakeConfigEnum;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wangxiayun
 * @since 2019-03-27
 */
public class SnowflakeIdWorker {

    // ==============================Fields===========================================
    /**
     * 开始时间截 (2015-01-01)
     */
    private final long twepoch;

    /**
     * ip 8bit的值
     */
    private final long workId = 0x000000FF & getLastIP();

    /**
     * ip 占用位数
     */
    private final long workIdBits = 8L;

    /**
     * 业务ID 长度
     */
    private final long transactionBits;

    /**
     * 序列在id中占的位数
     */
    private final long sequenceBits;

    private final long transactionShift;

    /**
     * ip 向左移14位数
     */
    private final long workIdShift;

    /**
     * 时间截向左移22位(8+14)
     */
    private final long timestampLeftShift;

    /**
     * 生成序列的掩码，这里为16383 (0b 11 1111 1111 1111=0x3fff=16383)
     */
    private final long sequenceMask;

    /**
     * 毫秒内序列(0~16383)
     */
    private long sequence = 0L;

    /**
     * 上次生成ID的时间截
     */
    private long lastTimestamp = -1L;

    /**
     * 左侧补齐
     */
    public static final String LEFT_PADDING = "0000000000000000";

    //==============================Constructors=====================================

    public SnowflakeIdWorker(SnowflakeConfigEnum snowflakeConfigEnum) {

        this.twepoch = snowflakeConfigEnum.getTwepoch();
        // 初始化各模块占位长度
        this.transactionBits = snowflakeConfigEnum.getTransactionBits();
        this.sequenceBits = snowflakeConfigEnum.getSequenceBits();

        // 初始化移位数量
        this.transactionShift = sequenceBits;
        this.workIdShift = sequenceBits + transactionBits;
        this.timestampLeftShift = sequenceBits + transactionBits + workIdBits;

        // 初始化毫秒内最大序列
        this.sequenceMask = -1L ^ (-1L << sequenceBits);
    }

    // ==============================Methods==========================================

    /**
     * 获得下一个ID (该方法是线程安全的)
     *
     * @return SnowflakeId
     */
    public synchronized long nextId() {
        long timestamp = timeGen();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        //如果是同一时间生成的，则进行毫秒内序列
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            //毫秒内序列溢出
            if (sequence == 0) {
                //阻塞到下一个毫秒,获得新的时间戳
                timestamp = tilNextMillis(lastTimestamp);
            }
        }
        //时间戳改变，毫秒内序列重置
        else {
            sequence = 0L;
        }

        //上次生成ID的时间截
        lastTimestamp = timestamp;

        //移位并通过或运算拼到一起组成64位的ID
        return ((timestamp - twepoch) << timestampLeftShift)
                | (workId << workIdShift)
                | sequence;
    }

    /**
     * 生成业务唯一ID
     *
     * @param transactionId 业务ID
     * @return 唯一ID
     */
    public synchronized long nextId(long transactionId) {
        if (transactionBits <= 0) {
            throw new RuntimeException("The current snowflakeIdWorker does not have transactionBits . ");
        }

        String binaryId = Long.toBinaryString(transactionId);
        binaryId = LEFT_PADDING + binaryId;
        long processId = Long.parseLong(binaryId.substring((int) (binaryId.length() - transactionBits)), Character.MIN_RADIX);
        long timestamp = timeGen();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        //如果是同一时间生成的，则进行毫秒内序列
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            //毫秒内序列溢出
            if (sequence == 0) {
                //阻塞到下一个毫秒,获得新的时间戳
                timestamp = tilNextMillis(lastTimestamp);
            }
        }
        //时间戳改变，毫秒内序列重置
        else {
            sequence = 0L;
        }

        //上次生成ID的时间截
        lastTimestamp = timestamp;

        //移位并通过或运算拼到一起组成64位的ID
        return ((timestamp - twepoch) << timestampLeftShift)
                | (workId << workIdShift)
                | (processId << transactionShift)
                | sequence;
    }

    public long getTransactionId(long id) {
        if (transactionBits <= 0) {
            throw new RuntimeException("The current ID does not have inner transaction ID. ");
        }

        String binaryId = Long.toBinaryString(id >> transactionShift);
        String transactionId = binaryId.substring((int) (binaryId.length() - transactionBits));
        return Long.parseLong(transactionId, Character.MIN_RADIX);
    }

    /**
     * 阻塞到下一个毫秒，直到获得新的时间戳
     *
     * @param lastTimestamp 上次生成ID的时间截
     * @return 当前时间戳
     */
    protected long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    /**
     * 返回以毫秒为单位的当前时间
     *
     * @return 当前时间(毫秒)
     */
    protected long timeGen() {
        return System.currentTimeMillis();
    }

    protected byte getLastIP() {
        byte lastip = 0;
        try {
            InetAddress ip = InetAddress.getLocalHost();
            byte[] ipByte = ip.getAddress();
            lastip = ipByte[ipByte.length - 1];
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return lastip;
    }

}