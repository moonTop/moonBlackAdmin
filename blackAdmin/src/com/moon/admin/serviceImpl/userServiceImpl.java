package com.moon.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import com.moon.admin.dao.mapper.UserMapper;
import com.moon.admin.po.User;
import com.moon.admin.service.userService;
import com.moon.admin.utils.MD5;

public class userServiceImpl implements userService {

	@Autowired
	private  UserMapper userDao;

	@Override
    public User findUserById(String id) throws Exception {
		
		User user = userDao.selectByPrimaryKey(id);
		
	    return user;
    }

	@Override
    public void addUser(User user) throws Exception {
		MD5 md5=new MD5();
		String md5ofStr = md5.getMD5ofStr(user.getPassword());
		user.setPassword(md5ofStr);
	    userDao.insert(user);
	    
    }

	@Override
    public void deleteUserById(String id) throws Exception {
		
	    userDao.deleteByPrimaryKey(id);
    }

	@Override
    public User findUserByModel(User user) throws Exception {
		User model = userDao.findUserByModel(user);
	    return model;
    }
	
	
	
}
