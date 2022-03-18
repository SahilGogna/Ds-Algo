package com.microservices.userauthnew.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "dob")
	private String dob;

	@Column(name = "password")
	private String password;

	public UserEntity() {
	}

	public UserEntity(String firstName, String lastName, String userName, String emailId, String dob, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		this.dob = dob;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getDob() {
		return dob;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", emailId="
				+ emailId + ", dob=" + dob + "]";
	}

}