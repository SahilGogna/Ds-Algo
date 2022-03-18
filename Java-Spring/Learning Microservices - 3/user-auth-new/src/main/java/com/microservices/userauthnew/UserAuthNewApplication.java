package com.microservices.userauthnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.userauthnew")
@EnableDiscoveryClient
public class UserAuthNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthNewApplication.class, args);
	}

}
