package com.maxima.app;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.maxima"})
public class HelloWorldSpringBoot {
	//https://www.youtube.com/watch?v=Bro59wWFOgo
	//https://www.youtube.com/watch?v=5RA5NpxbioI
	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(HelloWorldSpringBoot.class);
		//app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		SpringApplication.run(HelloWorldSpringBoot.class, args);
		
	}

}
