package com.securitydemo.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ApplicationController {
	
	@GetMapping("/getMessage")
	public String greeting() {
		return "Hello, It's working";
	}

}
