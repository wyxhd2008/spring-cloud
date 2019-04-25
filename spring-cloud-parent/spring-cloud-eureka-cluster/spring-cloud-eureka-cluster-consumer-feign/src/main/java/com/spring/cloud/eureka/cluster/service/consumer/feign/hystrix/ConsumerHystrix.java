package com.spring.cloud.eureka.cluster.service.consumer.feign.hystrix;

import org.springframework.stereotype.Component;

import com.spring.cloud.eureka.cluster.service.consumer.feign.facade.ConsumerFeignFacade;

@Component
public class ConsumerHystrix implements ConsumerFeignFacade {

	@Override
	public String consumer(String userName) {
        return "hello" + userName + ", this messge send failed ";
	}

}
