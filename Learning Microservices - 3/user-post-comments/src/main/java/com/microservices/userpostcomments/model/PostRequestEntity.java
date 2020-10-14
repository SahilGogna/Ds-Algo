package com.microservices.userpostcomments.model;

import java.io.Serializable;

public class PostRequestEntity implements Serializable{

	private int postId;
	private int userId;
	private String postText;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

}
