package com.microservices.userpostcomments.model;

import java.io.Serializable;

public class CommnetRequestEntity implements Serializable {

	private int postId;
	private int commentId;
	private int userId;
	private String commentText;

	public int getPostId() {
		return postId;
	}

	public int getUserId() {
		return userId;
	}

	public String getCommentText() {
		return commentText;
	}

	public int getCommentId() {
		return commentId;
	}

}
