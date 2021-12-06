package com.carry.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableAutoConfiguration
//@ComponentScan("com.carry.controller")
@SpringBootApplication(scanBasePackages = {"com.carry.controller"})
public class SpringApplications extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(SpringApplications.class, args);
	}
}
