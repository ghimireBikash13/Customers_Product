package com.cubic.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.entities.ProductsEntity;
import com.cubic.repositories.CustomersRepository;
import com.cubic.repositories.ProductsRepository;

public class InsertTestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml");
		ProductsRepository pr = (ProductsRepository) ctx.getBean("productsRepository");
		//CustomersRepository cr = (CustomersRepository) ctx.getBean("customersRepository");

		ProductsEntity pe1 = new ProductsEntity();
		pe1.setName("Mishi Kobe Niku");
		pe1.setDescription("Delicious and freshly prepared,organic");
		pe1.setPrice(34.45);
		pe1.setProduct_status("true");

		ProductsEntity pe2 = new ProductsEntity();
		pe2.setName("Apple Watch");
		pe2.setDescription("Series 5, solar charge, connect phone and can receive message");
		pe2.setPrice(235.78);
		pe2.setProduct_status("true");

		ProductsEntity pe3 = new ProductsEntity();
		pe3.setName("MacBook Pro");
		pe3.setDescription("128GB, touch screen and thumb and password lock.");
		pe3.setPrice(1500);
		pe3.setProduct_status("false");

		pr.save(pe1);
		pr.save(pe2);
		pr.save(pe3);

	}

}
