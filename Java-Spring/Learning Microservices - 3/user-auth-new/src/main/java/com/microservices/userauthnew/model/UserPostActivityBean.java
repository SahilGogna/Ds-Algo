package com.microservices.userauthnew.model;

import java.util.List;

public class UserPostActivityBean {
	private List<Post> posts;
	
	public UserPostActivityBean() {}
	
	public UserPostActivityBean(List<Post> posts) {
		this.posts = posts;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
}
