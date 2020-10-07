package com.example.microservices.userauthetication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String getWelcome() {
		return "<h1>Welcome User </h1>";
	}

}
