package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public User findUser(Long id) {
		return userMapper.finduser(id);
	}
	

}
