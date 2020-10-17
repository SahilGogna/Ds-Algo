package com.microservices.userauthnew.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.userauthnew.model.LoginRequest;
import com.microservices.userauthnew.model.Post;
import com.microservices.userauthnew.model.UserActivityBean;
import com.microservices.userauthnew.model.UserEntity;
import com.microservices.userauthnew.model.UserPostActivityBean;
import com.microservices.userauthnew.repo.MyUserRepo;

@Service
public class MyUserService {
	
	@Autowired
	MyUserRepo repo;
	
	@Autowired
	UserPostCommentsProxy proxy;
	
	
	public ResponseEntity<UserEntity> registerUser(UserEntity user) {
		Optional<UserEntity> userFound = repo.findByEmailId(user.getEmailId());
		if(!userFound.isPresent()) {
			UserEntity newUser = new UserEntity(user.getFirstName(), user.getLastName(), 
					user.getUserName(), user.getEmailId(), user.getDob(), user.getPassword());
			repo.save(newUser);
			return ResponseEntity.ok().body(newUser);
		}
		return ResponseEntity.badRequest().build();
	}
	
	public ResponseEntity<?> loginUser(LoginRequest user) {
		Optional<UserEntity> userFound = repo.findByEmailId(user.getEmailId());
		if(userFound.isPresent() && userFound.get().getPassword().equals(user.getPassword())) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
	
	public ResponseEntity<UserActivityBean> getAllUserPosts(int userId){
		ResponseEntity<List<Post>> response = proxy.getAllPost(userId);
		List<Post> posts = response.getBody();
		
		UserEntity user = repo.findById(userId);
		return ResponseEntity.ok(new UserActivityBean(userId, user.getUserName(), posts));
	}

	
	
	
	
	
	
	
	
	
}
