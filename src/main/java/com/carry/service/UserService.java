package com.carry.service;

import java.util.List;

import com.carry.pojo.User;

public interface UserService {
	//添加用户
	void addUser(User user);
	//分页查找用户
	List<User> findUsers(int page, int rows);
}
