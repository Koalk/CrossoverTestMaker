package com.crossover.testmaker.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crossover.testmaker.dao.UserDao;
import com.crossover.testmaker.model.User;
import com.crossover.testmaker.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Inject
	private UserDao userDao;
	
	public UserServiceImpl() {}
	
	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save(User user){
		userDao.save(user);
	}
}