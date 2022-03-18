package com.microservices.userpostcomments.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "postId")
	private int postId;

	@Column(name = "userId")
	private int userId;

	@Column(name = "postText")
	private String postText;

	@OneToMany(mappedBy= "postId",targetEntity= Comment.class, fetch = FetchType.EAGER)
	private List<Comment> postComments;

	@Column(name = "postTimestamp")
	private String postTimestamp;

	public Post() {
	}

	public Post(int userId, String postText, List<Comment> postComments, String postDate) {
		super();
		this.userId = userId;
		this.postText = postText;
		this.postComments = postComments;
		this.postTimestamp = postDate;
	}

	public int getPostId() {
		return postId;
	}

	public int getUserId() {
		return userId;
	}

	public String getPostText() {
		return postText;
	}

	public List<Comment> getPostComments() {
		return postComments;
	}

	public String getPostDate() {
		return postTimestamp;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public void setPostComments(List<Comment> postComments) {
		this.postComments = postComments;
	}

	public void setPostTimestamp(String postTimestamp) {
		this.postTimestamp = postTimestamp;
	}

	
}
