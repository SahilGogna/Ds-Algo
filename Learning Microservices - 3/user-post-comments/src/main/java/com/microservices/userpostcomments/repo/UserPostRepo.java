package com.microservices.userpostcomments.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.userpostcomments.model.Post;

@Repository
public interface UserPostRepo extends JpaRepository<Post, Integer>{
	List<Post> findByUserId(int userId);
	Post findByPostId(int postId);
}
