package com.microservices.userauthpostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UserAuthPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthPostgresqlApplication.class, args);
	}

}
