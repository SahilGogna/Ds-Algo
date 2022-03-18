package com.restfulwebservices.restfulwebservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulwebservices.restfulwebservices.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
