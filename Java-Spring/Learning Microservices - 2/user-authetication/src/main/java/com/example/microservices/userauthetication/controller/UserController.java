package com.example.microservices.userauthetication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String getWelcome() {
		return "<h1>Welcome </h1>";
	}
	
	@GetMapping("/user")
	public String getWelcomeUser() {
		return "<h1>Welcome User</h1>";
	}
	
	@GetMapping("/admin")
	public String getWelcomeAdmin() {
		return "<h1>Welcome Admin</h1>";
	}

}
