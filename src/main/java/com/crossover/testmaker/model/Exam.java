package com.crossover.testmaker.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import com.crossover.testmaker.view.ExamView;

@Entity
public class Exam implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String title;
	private String description;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="exam")
	private List<Question> questionList;
	private Integer duration;
	@Enumerated(EnumType.STRING)
	private Subject subject;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="exam")
	private List<ExamUser> examUserList;
	@Version
	private Integer version;
	
	public Exam() {}
	
	public Exam(ExamView view){
		this.title = view.getTitle();
		this.description = view.getDescription();
		this.duration = view.getDuration();
		this.subject = Subject.valueOf(view.getSubject());
	}

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

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<ExamUser> getExamUserList() {
		return examUserList;
	}

	public void setExamUserList(List<ExamUser> examUserList) {
		this.examUserList = examUserList;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}