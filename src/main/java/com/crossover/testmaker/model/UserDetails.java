package com.crossover.testmaker.model;

import org.springframework.security.core.authority.AuthorityUtils;

public class UserDetails extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 1L;
	
	private User user;
	public UserDetails(User user) {
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		this.user = user;
	}
	
	public User getUser() {
        return user;
    }

    public String getId() {
        return user.getUsername();
    }

    public Role getRole() {
        return user.getRole();
    }
}
