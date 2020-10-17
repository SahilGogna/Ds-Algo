package com.microservices.userauthnew.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.userauthnew.model.UserEntity;

@Repository
public interface MyUserRepo extends JpaRepository<UserEntity, Integer>{
	Optional<UserEntity> findByUserName(String userName);
	Optional<UserEntity> findByEmailId(String emailId);
	UserEntity findById(int id);
}
