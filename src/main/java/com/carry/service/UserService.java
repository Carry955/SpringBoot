package com.carry.service;

import com.carry.pojo.User;

public interface UserService {
	User findUser(String name);
	
	void saveUser(User user);
}
