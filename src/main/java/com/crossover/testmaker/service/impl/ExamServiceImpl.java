package com.crossover.testmaker.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crossover.testmaker.dao.ExamDao;
import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{

	@Inject
	private ExamDao examDao;
	
	public List<Exam> findAll() {
		return examDao.findAll();
	}
	public Exam findExam(Integer id){
		return examDao.findExam(id);
	}
	public void save(Exam exam) {
		examDao.save(exam);
	}	

	public void setExamDao(ExamDao examDao) {
		this.examDao = examDao;
	}
	
}
