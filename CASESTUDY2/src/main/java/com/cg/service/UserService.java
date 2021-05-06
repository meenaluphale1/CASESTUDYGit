package com.cg.service;

import com.cg.bean.User;
import com.cg.customexp.CustomExp;

public interface UserService {
	public User getUserByName(String username);
	public void createUser(User u)throws CustomExp;

}
