package com.wxy.ics.common.enums;

/**
 * 唯一ID生成配置枚举  注: transactionBits + sequenceBits
 *
 **/

/**
 * @author wangxiayun
 * @since 2019-03-27
 */
public enum SnowflakeConfigEnum {

    /**
     * 唯一ID业务生成配置枚举
     */

    MEMBER_NO(1420041600000L, 6L, 8L),
    ADDRESS_NO(1420041600000L, 6L, 8L),
    DEFAULT(1420041600000L, 6L, 8L),
    ;

    /**
     * 初始毫秒数  默认 1420041600000L
     */
    private long twepoch;

    /**
     * 业务数据占用位数  默认0位
     */
    private long transactionBits;

    /**
     * 序列位数 此值决定同一毫秒内最多生成的ID数量 2的sequenceBits次方个
     */
    private long sequenceBits;

    SnowflakeConfigEnum() {
        this.twepoch = 1420041600000L;
        this.transactionBits = 0L;
        this.sequenceBits = 14L;
    }

    SnowflakeConfigEnum(long twepoch, long transactionBits, long sequenceBits) {
        this.twepoch = twepoch;
        this.transactionBits = transactionBits;
        this.sequenceBits = sequenceBits;
    }

    public long getTwepoch() {
        return twepoch;
    }

    public long getTransactionBits() {
        return transactionBits;
    }

    public long getSequenceBits() {
        return sequenceBits;
    }
}
