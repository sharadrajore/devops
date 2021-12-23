package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<h2> Hello Devpos  Training !!!!! </h2> ";
	}

	
}
