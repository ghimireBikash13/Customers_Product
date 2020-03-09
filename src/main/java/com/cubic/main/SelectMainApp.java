package com.cubic.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.entities.CustomersEntity;
import com.cubic.entities.ProductsEntity;
import com.cubic.repositories.CustomersRepository;

public class SelectMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml");
		CustomersRepository cr = (CustomersRepository) ctx.getBean("customersRepository");
		
		CustomersEntity ce = cr.getById(1);
		System.out.println(ce.toString());
		
		for(ProductsEntity obj:ce.getProducts()) {
			System.out.println(obj.toString());
		}

	}

}
