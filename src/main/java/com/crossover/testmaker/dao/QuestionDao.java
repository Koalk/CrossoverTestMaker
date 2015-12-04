package com.crossover.testmaker.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.model.Question;

@RepositoryDefinition(domainClass = Question.class, idClass = Integer.class)
public interface QuestionDao {
	
	public Question findQuestion(Integer id);
	public List<Question> findQuestionByExam(Exam exam);
	public void save(Question question);

}
