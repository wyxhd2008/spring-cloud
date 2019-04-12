package com.spring.boot.docker.nginx.mysql.b.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.b.common.bean.UserPo;
import com.spring.boot.docker.nginx.mysql.b.repository.UserRepository;

@RestController
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/findByUserId/{userId}")
	public UserPo findByUserId(@PathVariable String userId){
		UserPo userPo = userRepository.findByUserId(userId);
		logger.info("user : {}", userPo);
		
		List<UserPo> userPos = userRepository.findAll();
		logger.info("all users : {}", userPos);

		return userPo;
	}
}
