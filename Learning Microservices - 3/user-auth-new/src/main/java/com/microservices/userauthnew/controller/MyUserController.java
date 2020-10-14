package com.microservices.userauthnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userauthnew.model.LoginRequest;
import com.microservices.userauthnew.model.UserEntity;
import com.microservices.userauthnew.service.MyUserService;

@RestController
public class MyUserController {
	
	@Autowired
	MyUserService service;
	
	@PostMapping(path = "/signup")
	public ResponseEntity<?> userSignUp(@RequestBody UserEntity user) {
		return service.registerUser(user);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> userLogIn(@RequestBody LoginRequest user) {
		return service.loginUser(user);
	}
	
}