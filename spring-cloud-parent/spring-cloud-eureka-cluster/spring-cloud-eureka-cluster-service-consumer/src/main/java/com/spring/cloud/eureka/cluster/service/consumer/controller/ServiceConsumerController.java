package com.spring.cloud.eureka.cluster.service.consumer.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class ServiceConsumerController {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

    @RequestMapping(value = "/consumer/restTemplate/{userName}")
    public String router(@PathVariable String userName) {
        RestTemplate restTpl = getRestTemplate();
        // 根据应用名称调用服务
        return restTpl.getForObject("http://spring-cloud-service-provider/provider/" + userName, String.class);
    }

}
