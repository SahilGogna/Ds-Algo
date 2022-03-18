package com.microservices.userpostcomments.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.userpostcomments.model.Comment;

@Repository
public interface UserCommentRepo extends JpaRepository<Comment, Integer>{
	List<Comment> findByPostId(int postId);
	List<Comment> findByUserId(int userId);
	Comment findByCommentId(int commentId);
}
