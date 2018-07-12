package com.abzal.endterm.dao;


import com.abzal.endterm.model.User;

import java.util.List;


public interface UserDao {

	User findById(int id);
	
	User findByUsername(String username);
	
	void save(User user);
	
	void deleteByUsername(String username);

	void deleteById(int id);
	
	List<User> findAllUsers();

}

