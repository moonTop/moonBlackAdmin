package com.moon.admin.service;

import com.moon.admin.po.User;

public interface userService {

	
	public User findUserById (String id) throws Exception;
	
	public User findUserByModel (User user) throws Exception;
	
	public void addUser(User user) throws  Exception;
	
	public void deleteUserById(String id)throws Exception;
	
	

}
