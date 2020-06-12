package com.restfulwebservices.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restfulwebservices.restfulwebservices.model.User;

@Repository
public class UserDaoService {
	
	private static List<User> users = new ArrayList<User>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "User 1", new Date()));
		users.add(new User(2, "User 2", new Date()));
		users.add(new User(3, "User 3", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User addUser(User user) {
		if(user.getUserId() == null) user.setUserId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int userId) {
		for(User user: users) {
			if(user.getUserId() == userId) return user;
		}
		return null;
	}

}
