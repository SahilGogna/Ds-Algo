package com.restfulwebservices.restfulwebservices.model;

import java.util.Date;

public class User {
	
	private Integer userId;
	private String userName;
	private Date userBirthDate;
	
	public User(Integer userId, String userName, Date userBirthDate) {
		this.userBirthDate = userBirthDate;
		this.userName = userName;
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userBirthDate=" + userBirthDate + "]";
	}
	

}
