package com.carry.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carry.pojo.User;

public interface UserMapper {
	@Select("select * from test where name=#{name} limit 1")
	User findUserByName(@Param("name")String name);
	
	@Insert("insert into test values(#{number}, #{name}, #{age}, #{gender})")
	void addUser(@Param("number")String number, @Param("name") String name, @Param("age") int age, @Param("gender") String gender);
}
