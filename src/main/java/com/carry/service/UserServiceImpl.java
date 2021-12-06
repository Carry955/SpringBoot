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
	public void addUser(User user) {
		userMapper.insert(user);
		int i =6/0;
	}

	@Override
	public List<User> findUsers(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<User> users = userMapper.selectAll();
		return users;
	}

}
