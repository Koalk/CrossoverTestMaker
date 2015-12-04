package com.crossover.testmaker.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

import com.crossover.testmaker.view.ExamUserView;

@Entity
@Immutable
public class ExamUser implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Exam exam;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private User user;
	@Temporal(TemporalType.TIMESTAMP)
	private Date tryDate;
	private Double score;
	
	public ExamUser(){}
	
	public ExamUser(ExamUserView view, Exam exam, User user) {
		this.exam = exam;
		this.user = user;
		this.tryDate = view.getDate();
		this.score = view.getScore();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getTryDate() {
		return tryDate;
	}

	public void setTryDate(Date tryDate) {
		this.tryDate = tryDate;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
}