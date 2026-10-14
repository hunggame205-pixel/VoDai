package com.vdtt.db;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class RedisManager {
    private JedisPool jedisPool;

    public RedisManager() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(1000); // Số kết nối tối đa
        poolConfig.setMaxIdle(300);   // Số kết nối nhàn rỗi tối đa
        poolConfig.setMinIdle(150);    // Số kết nối nhàn rỗi tối thiểu
        this.jedisPool = new JedisPool(poolConfig, "localhost", 6379);
    }

    private static final RedisManager instance = new RedisManager();

    public static RedisManager getInstance() {
        if (instance == null) {
            return new RedisManager();
        }
        return instance;
    }



    public List<String> getLoginHistory(String userId) {
        try (Jedis jedis = jedisPool.getResource()) {
            String key = "login_history:" + userId;
            return jedis.lrange(key, 0, -1);
        }
    }

    private void cleanupOldLogins(Jedis jedis, String userId) {
        String key = "login_history:" + userId;
        Instant thirtyDaysAgo = Instant.now().minus(30, ChronoUnit.DAYS);

        List<String> loginHistory = jedis.lrange(key, 0, -1);
        for (String loginTime : loginHistory) {
            Instant loginInstant = Instant.parse(loginTime);
            if (loginInstant.isBefore(thirtyDaysAgo)) {
                jedis.lrem(key, 1, loginTime);
            }
        }
    }


}

