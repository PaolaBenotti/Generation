package com.helloworld.hello.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloContol {
	
	@GetMapping
	public String hello() {
		return "Hello Generation!";
	}

}