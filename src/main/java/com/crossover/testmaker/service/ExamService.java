package com.crossover.testmaker.service;

import java.util.List;

import com.crossover.testmaker.dao.ExamDao;
import com.crossover.testmaker.model.Exam;

public interface ExamService {
	
	public List<Exam> findAll();
	public Exam findExam(Integer examId);
	public void save(Exam exam);
	
	public void setExamDao(ExamDao examDao);

}
