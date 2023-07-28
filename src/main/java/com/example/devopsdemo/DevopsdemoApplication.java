package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/devOps")
public class DevopsdemoApplication extends SpringBootServletInitializer {
	@GetMapping("/get")
	public String demo() {
		return "welcome to devOps";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
	}

}
