package com.spring.boot.b.redis;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.OxmSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.boot.b.common.bean.UserPo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={RedisApplication.class})
public class RedisTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void test() throws Exception{
		logger.info("redis test begin");
		stringRedisTemplate.opsForValue().set("key1", "value1");
		stringRedisTemplate.opsForValue().set("spring-boot-key2", "spring-boot-value2");

		logger.info("redis test end");
	}
	
	@Test
	public void testRedisTimeout() throws Exception{
		logger.info("redis test begin");
		UserPo user = new UserPo();
		
		redisTemplate.setKeySerializer(new StringRedisSerializer());
//		redisTemplate.setValueSerializer(new OxmSerializer());

		ValueOperations<String, UserPo> valueOperations = redisTemplate.opsForValue();
		valueOperations.set("spring-boot-user1", user);
		valueOperations.set("spring-boot-user2", user, 1, TimeUnit.SECONDS);
		
		logger.info("spring-boot-user1 exists : {}", redisTemplate.hasKey("spring-boot-user1"));
		logger.info("spring-boot-user2 exists : {}", redisTemplate.hasKey("spring-boot-user2"));
		
		Thread.sleep(1000);
		
		logger.info("spring-boot-user1 exists : {}", redisTemplate.hasKey("spring-boot-user1"));
		logger.info("spring-boot-user2 exists : {}", redisTemplate.hasKey("spring-boot-user2"));
		
		logger.info("spring-boot-user1 : {}", ((UserPo)redisTemplate.opsForValue().get("spring-boot-user1")).getUserName());
		
		logger.info("redis test end");
	}
}
