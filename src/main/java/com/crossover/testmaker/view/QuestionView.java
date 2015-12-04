package com.crossover.testmaker.view;

import java.io.Serializable;
import java.util.List;

import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.model.Question;

public class QuestionView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer examId;
	private String text;
	private List<String> answerList;
	private List<String> rightAnswerList;
	private Boolean multiChoice;
	
	public QuestionView() {}
	
	public QuestionView(Exam exam) {
		this.examId = exam.getId();
	}
	
	public QuestionView(Question question) {
		this.id = question.getId();
		this.examId = question.getExam().getId();
		this.text = question.getText();
		this.answerList = question.getAnswerList();
		this.rightAnswerList = question.getRightAnswerList();
		this.multiChoice = question.getMultiChoice();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getExamId() {
		return examId;
	}
	
	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<String> answerList) {
		this.answerList = answerList;
	}

	public List<String> getRightAnswerList() {
		return rightAnswerList;
	}

	public void setRightAnswerList(List<String> rightAnswerList) {
		this.rightAnswerList = rightAnswerList;
	}

	public Boolean getMultiChoice() {
		return multiChoice;
	}

	public void setMultiChoice(Boolean multiChoice) {
		this.multiChoice = multiChoice;
	}
}
