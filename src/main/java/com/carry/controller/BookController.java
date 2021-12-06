package com.carry.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
@ConfigurationProperties(prefix = "book")
public class BookController {
//	@Value("${book.author}")
	private String author;
	
//	@Value("${book.name}")
	private String name;
	
	@RequestMapping("/bookInfo")
	@ResponseBody
	public String showInfo() {
		return author+":"+name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookController.class, args);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

