package com.sahil.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfig retreiveLimitsFromConfig() {
		return new LimitConfig(config.getMaximum(),config.getMinimum());
	}

}
