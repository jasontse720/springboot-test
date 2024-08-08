package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String greeting(){
		return "Hello World!";
	}

	@GetMapping("/java")
	public String outputJava(){
		return "hello spring boot - Java World!";
	}

	@GetMapping("/hiro")
	public String hiro(){
		return "Hi, my name is Hiro, I am 10 years old.";
	}


}
