package com.spring.boot.b.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	public String helloSpringBoot(){
		return "hello spring boot";
	}
	
	@RequestMapping("/helloworld")
	public String helloWorld(){
		return "hello world";
	}
	
	@RequestMapping("/hello")
	public String helloSpringBoot(@RequestParam String param){
		logger.info("----" + param);
		return "hello " + param;
	}
	
	@RequestMapping("/hello/{param}")
	public String helloSpringBoot2(@PathVariable String param){
		logger.info("----" + param);
		return "hello " + param;
	}
}
