package com.microservices.userpostcomments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.userpostcomments.model.Comment;
import com.microservices.userpostcomments.model.CommnetRequestEntity;
import com.microservices.userpostcomments.model.Post;
import com.microservices.userpostcomments.repo.UserCommentRepo;
import com.microservices.userpostcomments.repo.UserPostRepo;

@Service
public class UserCommentService {
	
	@Autowired
	UserCommentRepo userCommentRepo;

	@Autowired
	UserPostRepo userPostRepo;
	
	public ResponseEntity<?> addComment(CommnetRequestEntity commentRequest){
		Comment comment = new Comment(commentRequest.getPostId(), commentRequest.getUserId(), commentRequest.getCommentText());
		userCommentRepo.save(comment);
		
		Post post = userPostRepo.findByPostId(commentRequest.getPostId());
		post.getPostComments().add(comment);
		userPostRepo.save(post);

		return ResponseEntity.ok().build();
	}
	
	
	public ResponseEntity<?> updateComment(CommnetRequestEntity commentRequest){
		Comment comment = userCommentRepo.findByCommentId(commentRequest.getCommentId());
		comment.setCommentText(commentRequest.getCommentText());
		userCommentRepo.save(comment);

		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<?> deleteComment(CommnetRequestEntity commentRequest){
		
		Post post = userPostRepo.findByPostId(commentRequest.getPostId());
		List<Comment> list = post.getPostComments();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getCommentId() == commentRequest.getCommentId()) {
				list.remove(i);
				break;
			}
		}
		
		Comment comment = userCommentRepo.findByCommentId(commentRequest.getCommentId());
		userCommentRepo.delete(comment);

		return ResponseEntity.ok().build();
	}
}
