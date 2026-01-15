package com.convit.redissonpoc.test.config;

import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.Objects;

public class RedissonConfig {

        private RedissonClient redissonClient;

        public RedissonClient getClient() {
            if (Objects.isNull(this.redissonClient)) {
                Config config = new Config();

            }
        }
}
