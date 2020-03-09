package com.cubic.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cubic.entities.ProductsEntity;

public class ProductsRepository {

	private SessionFactory sessionFactory;

	public void save(ProductsEntity products) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(products);
		session.getTransaction().commit();
		session.close();
	}

	public ProductsEntity getById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		ProductsEntity pe = (ProductsEntity) session.get(ProductsEntity.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return pe;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
