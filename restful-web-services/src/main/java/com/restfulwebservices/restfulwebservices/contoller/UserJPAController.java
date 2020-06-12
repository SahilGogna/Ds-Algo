package com.restfulwebservices.restfulwebservices.contoller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restfulwebservices.restfulwebservices.dao.PostRepo;
import com.restfulwebservices.restfulwebservices.dao.UserDaoService;
import com.restfulwebservices.restfulwebservices.dao.UserRepo;
import com.restfulwebservices.restfulwebservices.exceptions.UserNotFoundException;
import com.restfulwebservices.restfulwebservices.model.Post;
import com.restfulwebservices.restfulwebservices.model.User;

@RestController
public class UserJPAController {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	PostRepo postRepo;

	@GetMapping("/jpa/users")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/jpa/users/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		Optional<User> user = userRepo.findById(id);
		if (!user.isPresent())
			throw new UserNotFoundException("id-" + id);
		return user;
	}

	@DeleteMapping("/jpa/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepo.deleteById(id);
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userRepo.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
				.buildAndExpand(savedUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> getUserPosts(@PathVariable int id) {
		Optional<User> user = userRepo.findById(id);
		if (!user.isPresent())
			throw new UserNotFoundException("id-" + id);
		return user.get().getPosts();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object> addPost(@PathVariable int id ,@RequestBody Post post) {
		Optional<User> user = userRepo.findById(id);
		if (!user.isPresent())
			throw new UserNotFoundException("id-" + id);
		
		User retreivedUser = user.get();
		
		post.setUser(retreivedUser);
		postRepo.save(post);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(post.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
