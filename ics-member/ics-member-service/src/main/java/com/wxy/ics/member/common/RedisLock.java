package com.wxy.ics.member.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Collections;

@Service
public class RedisLock {

    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    /**
     * EX|PX, expire time units: EX = seconds; PX = milliseconds
      */
    private static final String SET_WITH_EXPIRE_TIME = "PX";

    @Autowired
    private RedisResource redisResource;

    /**
     * 尝试获取分布式锁
     * @param lockKey 锁
     * @param requestId 请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    public boolean tryGetDistributedLock(String lockKey, String requestId, int expireTime) {
        try (Jedis jedis = redisResource.getJedis()) {
            String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
            return LOCK_SUCCESS.equals(result);
        }
    }

    public boolean tryGetDistributedLock(String lockKey, String requestId) {
        return tryGetDistributedLock(lockKey, requestId, 10000);
    }

    public boolean tryGetDistributedLock(String lockKey) {
        return tryGetDistributedLock(lockKey, Thread.currentThread().getName(), 10000);
    }

    private static final Long RELEASE_SUCCESS = 1L;
    private static final String RELEASE_SCRIPT = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";

    /**
     * 释放分布式锁
     * @param lockKey 锁
     * @param requestId 请求标识
     * @return 是否释放成功
     */
    public boolean releaseDistributedLock(String lockKey, String requestId) {
        try (Jedis jedis = redisResource.getJedis()) {
            Object result = jedis.eval(RELEASE_SCRIPT, Collections.singletonList(lockKey), Collections.singletonList(requestId));
            return RELEASE_SUCCESS.equals(result);
        }
    }

    public boolean releaseDistributedLock(String lockKey) {
        return releaseDistributedLock(lockKey, Thread.currentThread().getName());
    }

}
