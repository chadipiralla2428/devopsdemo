package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsdemoApplication {
	@GetMapping("/get")
	public String demo() {
		return "jenkins demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
	}

}
