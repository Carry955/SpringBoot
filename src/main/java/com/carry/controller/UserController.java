package com.carry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carry.pojo.User;
import com.carry.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUser/{name}")
	public User findUser(@PathVariable String name) {
		return userService.findUser(name);
	}
	
	@RequestMapping("/saveUser")
	public String addUser() {
		User user = new User();
		user.setNumber("111");
		user.setName("111");
		user.setAge(111);
		user.setGender("male");
		userService.saveUser(user);
		return "Success";
	}
}
