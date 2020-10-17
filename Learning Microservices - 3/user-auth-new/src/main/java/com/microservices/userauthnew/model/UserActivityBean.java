package com.microservices.userauthnew.model;

import java.util.List;

public class UserActivityBean {

	private int userId;
	private String userName;
	private List<Post> posts;

	public UserActivityBean() {
	}

	public UserActivityBean(int userId, String userName, List<Post> posts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.posts = posts;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public List<Post> getPosts() {
		return posts;
	}

}
