package com.loginsystem.service;

import com.loginsystem.entity.User;
import com.loginsystem.repository.UserRepo;

public interface UserService {

	public User saveUser(User user);
	
}
