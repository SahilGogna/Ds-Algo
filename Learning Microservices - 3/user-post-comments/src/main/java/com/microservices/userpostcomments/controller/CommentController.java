package com.microservices.userpostcomments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userpostcomments.model.Comment;
import com.microservices.userpostcomments.model.CommnetRequestEntity;
import com.microservices.userpostcomments.service.UserCommentService;

@RestController
public class CommentController {
	
	@Autowired
	UserCommentService userCommentService;

	@PostMapping(path = "/addComment")
	public ResponseEntity<Comment> addcomment(@RequestBody CommnetRequestEntity commentReq){
		return userCommentService.addComment(commentReq);
	}
	
	@PostMapping(path = "/updateComment")
	public ResponseEntity<Comment> updatePost(@RequestBody CommnetRequestEntity commentReq){
		return userCommentService.updateComment(commentReq);
	}
	
	@PostMapping(path = "/deleteComment")
	public ResponseEntity<Comment> adddelete(@RequestBody CommnetRequestEntity commentReq){
		return userCommentService.deleteComment(commentReq);
	}
}
