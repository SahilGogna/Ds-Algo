package com.microservices.userpostcomments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userpostcomments.model.PostRequestEntity;
import com.microservices.userpostcomments.service.UserPostService;

@RestController
public class PostController {
	
	@Autowired
	UserPostService userPostService;
	
	@PostMapping(path = "/addPost")
	public ResponseEntity<?> addPost(@RequestBody PostRequestEntity postReq){
		return userPostService.addPost(postReq);
	}
	
	@PostMapping(path = "/updatePost")
	public ResponseEntity<?> updatePost(@RequestBody PostRequestEntity postReq){
		return userPostService.updatePost(postReq);
	}
	
	@PostMapping(path = "/deletePost")
	public ResponseEntity<?> deletePost(@RequestBody PostRequestEntity postReq){
		return userPostService.deletePost(postReq);
	}

}
