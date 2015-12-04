package com.crossover.testmaker.service.impl;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crossover.testmaker.model.User;
import com.crossover.testmaker.model.UserDetails;
import com.crossover.testmaker.service.UserDetailService;
import com.crossover.testmaker.service.UserService;

@Service
public class UserDetailsServiceImpl implements UserDetailService{

	@Inject
	private UserService userService;
	
	public UserDetailsServiceImpl(){}
	
	@Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.getUserByUsername(username);
        UserDetails detail = null;
        if (user != null){
        	detail = new UserDetails(user);
        }
        else {
        	throw new UsernameNotFoundException("Username not found");
        }
        return detail;
    }

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}