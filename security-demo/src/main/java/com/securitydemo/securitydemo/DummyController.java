package com.securitydemo.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth")
public class DummyController {
	
	@GetMapping("/getGreeting")
	public String sayHi() {
		return "Hiiiii...";
	}

}
