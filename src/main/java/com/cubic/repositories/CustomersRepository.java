package com.cubic.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cubic.entities.CustomersEntity;

public class CustomersRepository {
	
	private SessionFactory sessionFactory;
	
	public void save(CustomersEntity customers) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(customers);
		session.getTransaction().commit();
		session.close();
			
	}
	
	public CustomersEntity getById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		CustomersEntity ce = (CustomersEntity) session.get(CustomersEntity.class, id);
		session.getTransaction().commit();
		session.close();
		
		return ce;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
