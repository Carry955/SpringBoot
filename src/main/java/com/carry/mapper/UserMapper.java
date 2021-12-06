package com.carry.mapper;

import java.util.List;

import com.carry.pojo.User;

public interface UserMapper {
	public int insert(User user);
	
	public List<User> selectAll();
}
