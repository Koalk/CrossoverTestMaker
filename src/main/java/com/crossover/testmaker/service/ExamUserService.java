package com.crossover.testmaker.service;

import java.util.List;

import com.crossover.testmaker.dao.ExamUserDao;
import com.crossover.testmaker.model.ExamUser;
import com.crossover.testmaker.model.User;

public interface ExamUserService {

	public List<ExamUser> getExamUserByUser(User user);
	public void setExamUserDao(ExamUserDao examUserDao);
}
