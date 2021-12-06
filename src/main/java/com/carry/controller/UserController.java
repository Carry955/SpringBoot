package com.carry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carry.pojo.User;
import com.carry.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveUser")
	@ResponseBody
	public String saveUser() {
		User user = new User();
		user.setNumber("111");
		user.setName("111");
		user.setAge(111);
		user.setGender("male");
		userService.addUser(user);
		return "success";
	}
	
	@RequestMapping("/findUsers/{page}/{rows}")
	@ResponseBody
	public List<User> findUsers(@PathVariable int page, @PathVariable int rows){
		return userService.findUsers(page, rows);
	}
}
