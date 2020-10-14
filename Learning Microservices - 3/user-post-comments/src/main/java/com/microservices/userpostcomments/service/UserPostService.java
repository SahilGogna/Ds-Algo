package com.microservices.userpostcomments.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.userpostcomments.model.Post;
import com.microservices.userpostcomments.model.PostRequestEntity;
import com.microservices.userpostcomments.repo.UserPostRepo;

@Service
public class UserPostService {
	
	@Autowired
	UserPostRepo userPostRepo;

	public ResponseEntity<Post> addPost(PostRequestEntity postRequest){
		Post post = new Post(postRequest.getUserId(), postRequest.getPostText(),new ArrayList<>(), String.valueOf(System.currentTimeMillis()));
		userPostRepo.save(post);
		return ResponseEntity.ok(post);
	}
	
	public ResponseEntity<Post> updatePost(PostRequestEntity postRequest){
		Post post = userPostRepo.findByPostId(postRequest.getPostId());
		post.setPostText(postRequest.getPostText());
		post.setPostTimestamp(String.valueOf(System.currentTimeMillis()));
		userPostRepo.save(post);
		return ResponseEntity.ok(post);
	}
	
	public ResponseEntity<Post> deletePost(PostRequestEntity postRequest){
		Post post = userPostRepo.findByPostId(postRequest.getPostId());
		userPostRepo.delete(post);
		return ResponseEntity.ok(post);
	}
	
	public ResponseEntity<List<Post>> getAllPost(int userId){
		List<Post> post = userPostRepo.findByUserId(userId);
		return ResponseEntity.ok(post);
	}
}
