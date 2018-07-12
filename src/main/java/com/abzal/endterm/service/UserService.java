package com.abzal.endterm.service;

import com.abzal.endterm.model.User;

import java.util.List;


public interface UserService {
	
	User findById(int id);
	
	User findByUsername(String username);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserByUsername(String username);
	void deleteUserById(int userId);

	List<User> findAllUsers(); 
	
	boolean isUserUsernameUnique(Integer id, String username);

}