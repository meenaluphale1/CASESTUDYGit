package com.cg.dao;

import com.cg.bean.User;

public interface UserDao {
	
	
	
	public User getUserByName(String username);
	public void createUser(User u);

	
}
