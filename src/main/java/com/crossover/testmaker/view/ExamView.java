package com.crossover.testmaker.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.crossover.testmaker.model.Exam;

public class ExamView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String description;
	private Integer duration;
	private String subject;
	private Integer version;
	private List<QuestionView> questionViewList = new ArrayList<>();
	
	public ExamView(Exam exam){
		this.id = exam.getId();
		this.title = exam.getTitle();
		this.description = exam.getDescription();
		this.duration = exam.getDuration();
		this.subject = exam.getSubject().toString();
		this.questionViewList = exam.getQuestionList().stream().map(elem -> new QuestionView(elem)).collect(Collectors.toList());
		this.version = exam.getVersion();
	}

	public ExamView() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public List<QuestionView> getQuestionViewList() {
		return questionViewList;
	}
	
	public void setQuestionViewList(List<QuestionView> questionViewList) {
		this.questionViewList = questionViewList;
	}
}