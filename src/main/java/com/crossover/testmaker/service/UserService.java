package com.crossover.testmaker.service;

import com.crossover.testmaker.dao.UserDao;
import com.crossover.testmaker.model.User;

public interface UserService {
	
	public User getUserByUsername(String username);
	public void setUserDao(UserDao userDao);
	public void save(User user);
}