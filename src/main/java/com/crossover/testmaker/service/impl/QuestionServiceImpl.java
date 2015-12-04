package com.crossover.testmaker.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crossover.testmaker.dao.QuestionDao;
import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.model.Question;
import com.crossover.testmaker.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Inject
	private QuestionDao questionDao;

	@Override
	public Question findQuestion(Integer id) {
		return questionDao.findQuestion(id);
	}

	@Override
	public List<Question> findQuestionByExam(Exam exam) {
		return questionDao.findQuestionByExam(exam);
	}

	@Override
	public Double evaluateScore(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Question question) {
		questionDao.save(question);
	}

	@Override
	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
}