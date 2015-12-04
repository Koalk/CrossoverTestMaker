package com.crossover.testmaker.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

import com.crossover.testmaker.view.UserView;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String username;
	private String password;
	@Email
	private String email;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy="user")
	private List<ExamUser> examUserList;
	private Boolean enabled;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public User(){}
	public User(UserView view){
		this.username = view.getUsername();
		this.password = view.getPassword();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<ExamUser> getExamUserList() {
		return examUserList;
	}

	public void setExamUserList(List<ExamUser> examUserList) {
		this.examUserList = examUserList;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}