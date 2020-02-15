package com.saumitra.sessionmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class SpringSessionWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionWithRedisApplication.class, args);
	}

	
	@Bean
	public Jedis jedis() {
		return new Jedis("localhost", 6379);
	}

}
