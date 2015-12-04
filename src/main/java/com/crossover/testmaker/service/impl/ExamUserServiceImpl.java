package com.crossover.testmaker.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crossover.testmaker.dao.ExamUserDao;
import com.crossover.testmaker.model.ExamUser;
import com.crossover.testmaker.model.User;
import com.crossover.testmaker.service.ExamUserService;

@Service
public class ExamUserServiceImpl implements ExamUserService{

	@Inject
	private ExamUserDao examUserDao;
	
	public List<ExamUser> getExamUserByUser(User user) {
		return examUserDao.getExamUserByUser(user);
	}

	public void setExamUserDao(ExamUserDao examUserDao) {
		this.examUserDao = examUserDao;
	}
}
