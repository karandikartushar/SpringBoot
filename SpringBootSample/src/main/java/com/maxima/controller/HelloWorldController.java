package com.maxima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello")
	public String sayHello() {
		return "Hello World!!!";
	}
}
