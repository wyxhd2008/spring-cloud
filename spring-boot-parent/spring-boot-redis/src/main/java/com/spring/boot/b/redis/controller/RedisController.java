package com.spring.boot.b.redis.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.b.common.bean.UserPo;

@RestController
public class RedisController {

	@RequestMapping("/get")
	@Cacheable(key="#p0", value="spring-boot-redis")
	public UserPo get(@RequestParam String name){
		UserPo user = new UserPo();
		return user;
	}
}
