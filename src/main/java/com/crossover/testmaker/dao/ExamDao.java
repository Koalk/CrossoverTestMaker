package com.crossover.testmaker.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import com.crossover.testmaker.model.Exam;

@RepositoryDefinition(domainClass = Exam.class, idClass = Integer.class)
public interface ExamDao {
	
	public List<Exam> findAll();
	public Exam findExam(Integer id);
	public void save(Exam exam);
	
}
