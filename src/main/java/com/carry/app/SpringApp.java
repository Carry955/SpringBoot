package com.carry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.carry")
public class SpringApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
}
