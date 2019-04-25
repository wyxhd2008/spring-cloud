package com.spring.cloud.eureka.cluster.service.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com.spring.cloud.eureka.cluster.service.consumer.feign")
@EnableFeignClients(basePackages="com.spring.cloud.eureka.cluster.service.consumer.feign.facade")
public class ConsumerFeignApplication {

	public static void main(String [] args){
		SpringApplication.run(ConsumerFeignApplication.class, args);
	}
}
