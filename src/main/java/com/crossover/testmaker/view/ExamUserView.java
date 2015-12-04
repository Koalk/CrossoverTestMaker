package com.crossover.testmaker.view;

import java.io.Serializable;
import java.util.Date;

import com.crossover.testmaker.model.ExamUser;

public class ExamUserView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer examId;
	private String examTitle;
	private String username;
	private Date date;
	private Double score;
	
	public ExamUserView(ExamUser examUser) {
		this.id = examUser.getId();
		this.examId = examUser.getExam().getId();
		this.examTitle = examUser.getExam().getTitle();
		this.username = examUser.getUser().getUsername();
		this.date = examUser.getTryDate();
		this.score = examUser.getScore();
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

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
}