package com.laboratory.management.mapper;

//import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.laboratory.management.pojo.User;

public interface UserMapper {
	
	//public List<User> selectAllUser();
	
	public User login(@Param("userId")String userId,@Param("password")String password);
	
	public User getUserInfo(@Param("userId")String userId);
}
