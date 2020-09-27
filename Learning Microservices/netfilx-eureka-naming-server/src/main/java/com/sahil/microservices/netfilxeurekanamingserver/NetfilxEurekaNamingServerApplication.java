package com.sahil.microservices.netfilxeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetfilxEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfilxEurekaNamingServerApplication.class, args);
	}

}
