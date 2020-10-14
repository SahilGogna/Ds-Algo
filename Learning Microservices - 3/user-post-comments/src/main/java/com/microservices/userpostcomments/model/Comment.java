package com.microservices.userpostcomments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "commentId")
	private int commentId;

    @JoinColumn(name = "postId")
	private int postId;

	@Column(name = "userId")
	private int userId;

	@Column(name = "commentText")
	private String commentText;

	@Column(name = "commentTimestamp")
	private String commentTimestamp;

	public Comment() {
	}

	public Comment(int postId, int userId, String commentText) {
		this.postId = postId;
		this.userId = userId;
		this.commentText = commentText;
		this.commentTimestamp = String.valueOf(System.currentTimeMillis());
	}
	
	public int getCommentId() {
		return commentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public String getCommentTimestamp() {
		return commentTimestamp;
	}

	public void setCommentTimestamp(String commentTimestamp) {
		this.commentTimestamp = commentTimestamp;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

}
