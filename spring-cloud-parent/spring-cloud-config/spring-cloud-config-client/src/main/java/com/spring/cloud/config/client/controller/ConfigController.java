package com.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${config.value}")
	private String value;
	
	@GetMapping("/config/value")
	public String getValue(){
		return this.value;
	}
}
