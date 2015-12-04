package com.crossover.testmaker.dao;

import org.springframework.data.repository.RepositoryDefinition;

import com.crossover.testmaker.model.User;

@RepositoryDefinition(domainClass = User.class, idClass = String.class)
public interface UserDao{

	public User getUserByUsername(String userName);

	public void save(User user);
}
