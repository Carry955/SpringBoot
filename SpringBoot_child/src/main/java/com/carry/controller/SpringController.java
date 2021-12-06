package com.carry.controller;

import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.tools.sjavac.Log;


@RestController
public class SpringController {
	@RequestMapping("/hello")
//	@ResponseBody	//·µ»ØRestfulÄÚÈÝ
	public String yes() {
		return "Hello";
	}
	@RequestMapping("/ok")
//	@ResponseBody
	public String ok() {
		return "ok";
	}
	
	@RequestMapping("/info/{msg}")
	public String show(@PathVariable String msg) {
		return "show:"+msg;
	}
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
	}
	@RequestMapping("/tt")
	public String test() {
		return "ÄãºÃ";
	}
}
