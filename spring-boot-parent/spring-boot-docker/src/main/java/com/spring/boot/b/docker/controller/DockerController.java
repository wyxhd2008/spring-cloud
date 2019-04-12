package com.spring.boot.b.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping("/test")
	public String test(){
		return "hello dock";
	}
}
