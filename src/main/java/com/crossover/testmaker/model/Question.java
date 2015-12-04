package com.crossover.testmaker.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.crossover.testmaker.view.QuestionView;

@Entity
public class Question implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String text;
	@ElementCollection
	private List<String> answerList;
	@ElementCollection
	private List<String> rightAnswerList;
	private Boolean multiChoice;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Exam exam;
	
	public Question(){}
	
	public Question(QuestionView view, Exam exam){
		this.text = view.getText();
		this.answerList = view.getAnswerList();
		this.rightAnswerList = view.getRightAnswerList();
		this.multiChoice = view.getMultiChoice();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
}