package com.spring.cloud.eureka.cluster.service.provider;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderApplication 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		SpringApplication.run(ServiceProviderApplication.class, args);
		
        /**
         * 读取控制台输入的端口
         */
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        new SpringApplicationBuilder(ServiceProviderApplication.class).properties("server.port=" + port).run(args);
    }
}
