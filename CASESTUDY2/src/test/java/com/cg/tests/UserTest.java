package com.cg.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.bean.User;
import com.cg.dao.UserDao;
import com.cg.dao.UserDaoImpl;

public class UserTest {
	
	@Test
	public void showRoleUser()
	{
		UserDao dao= new UserDaoImpl();
		User u1=dao.getUserByName("Jay");	
		assertEquals(u1.getRoleCode(),"insured");		
	}
}
