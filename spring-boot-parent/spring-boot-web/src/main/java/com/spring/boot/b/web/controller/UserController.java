package com.spring.boot.b.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.b.common.bean.UserPo;

@RestController
public class UserController {

	@RequestMapping("/get")
	public UserPo get(){
		UserPo userPo = new UserPo();
		userPo.setId(1L);
		userPo.setUserName("wuguocai");
		return userPo;
	}
}
