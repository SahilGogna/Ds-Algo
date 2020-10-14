package com.microservices.userpostcomments.service;

import java.util.ArrayList;

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

	public ResponseEntity<?> addPost(PostRequestEntity postRequest){
		Post post = new Post(postRequest.getUserId(), postRequest.getPostText(),new ArrayList<>(), String.valueOf(System.currentTimeMillis()));
		userPostRepo.save(post);
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<?> updatePost(PostRequestEntity postRequest){
		Post post = userPostRepo.findByPostId(postRequest.getPostId());
		post.setPostText(postRequest.getPostText());
		post.setPostTimestamp(String.valueOf(System.currentTimeMillis()));
		userPostRepo.save(post);
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<?> deletePost(PostRequestEntity postRequest){
		Post post = userPostRepo.findByPostId(postRequest.getPostId());
		userPostRepo.delete(post);
		return ResponseEntity.ok().build();
	}
}
