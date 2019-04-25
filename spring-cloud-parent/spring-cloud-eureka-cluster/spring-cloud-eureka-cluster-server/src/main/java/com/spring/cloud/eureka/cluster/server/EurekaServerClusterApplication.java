package com.spring.cloud.eureka.cluster.server;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerClusterApplication {

	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String profiles = scanner.nextLine();
		
		new SpringApplicationBuilder(EurekaServerClusterApplication.class).profiles(profiles).run(args);
//		SpringApplication.run(EurekaServerClusterApplication.class, args);
	}
}
