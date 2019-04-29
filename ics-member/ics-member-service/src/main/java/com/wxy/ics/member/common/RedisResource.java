package com.wxy.ics.member.common;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Redis资源
 */
@Component
@Slf4j
public class RedisResource {

    @CreateCache(expire = 60 * 60 * 24 * 7, cacheType = CacheType.REMOTE, name = "base")
    private Cache<String, String> base;

    public String getString(String key) {
        return base.get(key);
    }

    public void setString(String key, String value) {
        base.put(key, value);
    }

    /**
     * 获取jedis对象, 记得归还资源哦
     * @return .
     */
    public Jedis getJedis() {
        JedisPool pool = base.unwrap(JedisPool.class);
        return pool.getResource();
    }
}