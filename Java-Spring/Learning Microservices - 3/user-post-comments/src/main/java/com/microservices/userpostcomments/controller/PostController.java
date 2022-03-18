package com.microservices.userpostcomments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userpostcomments.model.Post;
import com.microservices.userpostcomments.model.PostRequestEntity;
import com.microservices.userpostcomments.service.UserPostService;

@RestController
public class PostController {
	
	@Autowired
	UserPostService userPostService;
	
	@PostMapping(path = "/addPost")
	public ResponseEntity<Post> addPost(@RequestBody PostRequestEntity postReq){
		return userPostService.addPost(postReq);
	}
	
	@PostMapping(path = "/updatePost")
	public ResponseEntity<Post> updatePost(@RequestBody PostRequestEntity postReq){
		return userPostService.updatePost(postReq);
	}
	
	@PostMapping(path = "/deletePost")
	public ResponseEntity<Post> deletePost(@RequestBody PostRequestEntity postReq){
		return userPostService.deletePost(postReq);
	}
	
	@GetMapping(path = "/getAllPost/{userId}")
	public ResponseEntity<List<Post>> getAllPost(@PathVariable("userId") int userId){
		return userPostService.getAllPost(userId);
	}

}
