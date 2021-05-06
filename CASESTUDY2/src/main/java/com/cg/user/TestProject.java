package com.cg.user;

import com.cg.bean.User;
import com.cg.customexp.CustomExp;
import com.cg.dao.UserDao;
import com.cg.dao.UserDaoImpl;
import com.cg.service.UserService;
import com.cg.service.UserServiceImpl;

public class TestProject {
	public static void main(String[] args) {
//		UserDao dao= new UserDaoImpl();
		UserService service= new UserServiceImpl();		
		try
		{		
			//find user by name 
		User u1=service.getUserByName("Jay");
		System.out.println(u1);						
		
		// add user to db 
		User u=new User("Monu","Monu123","Agent");	
		service.createUser(u);
		}
		catch(CustomExp e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}

}
