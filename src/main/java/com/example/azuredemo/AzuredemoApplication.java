package com.example.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Azure! Welcome to Spring Boot on Azure!";
	}
}
