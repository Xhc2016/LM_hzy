package com.laboratory.management.service;

import com.laboratory.management.pojo.User;

/**
 * @author 13986
 *2018-7-30
 *23:02
 */
public interface UserService {
	
	/*public List<User> selectAllUser();*/
	
	public User login(String userId,String password);
	

}
