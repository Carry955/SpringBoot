package com.carry.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration(exclude={RedisAutoConfiguration.class})
@Controller
public class IndexController {
	@RequestMapping("/")
	@ResponseBody
	public String first() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
}
