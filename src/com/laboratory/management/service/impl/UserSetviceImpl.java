package com.laboratory.management.service.impl;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.management.mapper.UserMapper;
import com.laboratory.management.pojo.User;
import com.laboratory.management.service.UserService;


/**
 * @author 13986
 *2018-7-30
 *23:02
 */
@Service
public class UserSetviceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	/*
	public List<User> selectAllUser(){
		
		return userMapper.selectAllUser();
	}
	*/
	public User login(String userId,String password) {
		
		User user = null;
		
		if(userMapper.login(userId, password) != null) {
			
			user = userMapper.getUserInfo(userId);
		}
		
		return user;
		
	}
	
	

}
