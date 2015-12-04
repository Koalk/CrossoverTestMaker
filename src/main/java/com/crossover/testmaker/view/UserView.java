package com.crossover.testmaker.view;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class UserView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String username;
	@NotNull
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}