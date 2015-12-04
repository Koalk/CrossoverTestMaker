package com.crossover.testmaker.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService extends UserDetailsService{
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	public void setUserService(UserService userService);
}
