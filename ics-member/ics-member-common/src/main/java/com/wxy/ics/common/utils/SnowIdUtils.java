package com.wxy.ics.common.utils;


import com.wxy.ics.common.enums.SnowflakeConfigEnum;

import java.util.Random;

/**
 * @author wangxiayun
 * @since 2019-03-28
 */
public class SnowIdUtils {
    private static final SnowflakeIdWorker SNOWFLAKE_ID_WORKER = new SnowflakeIdWorker(SnowflakeConfigEnum.MEMBER_NO);

    private static final Random random = new Random();


    public static Long createUserCode() {
        return SNOWFLAKE_ID_WORKER.nextId(random.nextInt(64));
    }

    public static Long createBuyerCode(Long userCode) {
        return SNOWFLAKE_ID_WORKER.nextId(SNOWFLAKE_ID_WORKER.getTransactionId(userCode));
    }

    public static Long createSellerCode(Long userCode) {
        return SNOWFLAKE_ID_WORKER.nextId(SNOWFLAKE_ID_WORKER.getTransactionId(userCode));
    }

    public static Long createShopCode(Long userCode) {
        return SNOWFLAKE_ID_WORKER.nextId(SNOWFLAKE_ID_WORKER.getTransactionId(userCode));
    }




}
