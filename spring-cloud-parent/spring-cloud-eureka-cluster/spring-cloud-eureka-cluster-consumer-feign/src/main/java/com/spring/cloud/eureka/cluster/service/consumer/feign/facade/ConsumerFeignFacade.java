package com.spring.cloud.eureka.cluster.service.consumer.feign.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cloud.eureka.cluster.service.consumer.feign.hystrix.ConsumerHystrix;

@FeignClient(name = "spring-cloud-service-provider", fallback = ConsumerHystrix.class)
public interface ConsumerFeignFacade {

	@RequestMapping(value = "/provider/feign/{userName}", method = RequestMethod.GET)
	public String consumer(@PathVariable("userName") String userName);
}
