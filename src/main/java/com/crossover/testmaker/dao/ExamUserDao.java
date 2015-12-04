package com.crossover.testmaker.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import com.crossover.testmaker.model.ExamUser;
import com.crossover.testmaker.model.User;

@RepositoryDefinition(domainClass = ExamUser.class, idClass = Integer.class)
public interface ExamUserDao {

	public List<ExamUser> getExamUserByUser(User user);
	
	public void save(ExamUser examUser);
}