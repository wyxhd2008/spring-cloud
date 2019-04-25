package com.spring.cloud.eureka.cluster.service.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/provider/feign/{userName}", method = RequestMethod.GET )
	public String provide(@PathVariable("userName") String userName){
		logger.info("userName={}", userName);
		
		return userName;
	}
}
