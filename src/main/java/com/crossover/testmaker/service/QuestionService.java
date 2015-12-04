package com.crossover.testmaker.service;

import java.util.List;

import com.crossover.testmaker.dao.QuestionDao;
import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.model.Question;

public interface QuestionService {
	
	public Question findQuestion(Integer id);
	public List<Question> findQuestionByExam(Exam exam);
	public Double evaluateScore(Question question);
	public void save(Question question);

	public void setQuestionDao(QuestionDao questionDao);
}
