package com.miempresa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.config.ConfigureRedisAction;

import com.miempresa.models.User;

@Configuration
public class RedisConfiguration {
	@Bean
	 public LettuceConnectionFactory redisConnectionFactory() {

	    RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("EnrollmentSystem.redis.cache.windows.net",6379);
	    config.setPassword("BR6ZFza+RTaX1s0nkYafsYZtM7yl447KI4+L+8A3eIU=");
	    return new LettuceConnectionFactory(config);
	  }
	@Bean
    public ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }
	@Bean
	RedisTemplate<String, User> redisTemplate(){
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<String, User>();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		return redisTemplate;
	}
}
