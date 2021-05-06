package com.cg.service;

import com.cg.bean.User;
import com.cg.customexp.CustomExp;
import com.cg.dao.UserDao;
import com.cg.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	
	UserDao userDao ;   //policyDao // claimDao 
	
	public UserServiceImpl()
	{
		userDao= new UserDaoImpl();
	}
	

	public User getUserByName(String username) {

		User u=userDao.getUserByName(username);
		return u;
	}

	public void createUser(User u) throws CustomExp{

		User u1=getUserByName(u.getUserName());
		
		if(u1==null)
		{
		throw new CustomExp("User does not exist");			
		}
		else
		{
			userDao.createUser(u);
		}
		
		
	}

}
