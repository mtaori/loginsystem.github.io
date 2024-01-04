package com.loginsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginsystem.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	
	public User findByEmail(String email);

}
