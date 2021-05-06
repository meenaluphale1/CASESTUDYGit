package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.bean.User;
import com.cg.dbutil.JPAUtil;

public class UserDaoImpl implements UserDao {

	private EntityManager em; // em

	public UserDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

	public User getUserByName(String username) {
		
		User u1 = em.find(User.class, username);		
		return null;
	}

	public void createUser(User u)  {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}

}
