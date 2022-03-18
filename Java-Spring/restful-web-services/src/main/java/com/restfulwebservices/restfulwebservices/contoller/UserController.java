package com.restfulwebservices.restfulwebservices.contoller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restfulwebservices.restfulwebservices.dao.UserDaoService;
import com.restfulwebservices.restfulwebservices.exceptions.UserNotFoundException;
import com.restfulwebservices.restfulwebservices.model.User;

@RestController
public class UserController {

	@Autowired
	UserDaoService userDaoService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}

	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable int userId) {
		User user = userDaoService.findOne(userId);
		if (user == null)
			throw new UserNotFoundException("id-" + userId);
	    return user;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userDaoService.addUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
				.buildAndExpand(savedUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
