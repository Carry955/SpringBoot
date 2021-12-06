package com.carry.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carry.mapper.UserMapper;
import com.carry.pojo.User;
import com.github.pagehelper.PageHelper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUser(String name) {
		return userMapper.findUserByName(name);
	}
	
	@Override
	public void saveUser(User user) {
		userMapper.addUser(user.getNumber(), user.getName(), user.getAge(), user.getGender());
	}
	
	
}
