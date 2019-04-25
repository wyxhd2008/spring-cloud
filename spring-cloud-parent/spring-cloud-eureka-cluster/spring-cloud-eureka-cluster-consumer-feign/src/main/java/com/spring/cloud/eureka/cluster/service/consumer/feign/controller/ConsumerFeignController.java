package com.spring.cloud.eureka.cluster.service.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.eureka.cluster.service.consumer.feign.facade.ConsumerFeignFacade;


@RestController
public class ConsumerFeignController {
	@Autowired
	private ConsumerFeignFacade consumerFeignFacade;

    @RequestMapping(value = "/consumer/feign/{userName}", method = RequestMethod.GET)
    public String consumer(@PathVariable String userName) {
        return consumerFeignFacade.consumer(userName);
    }
}


