package com.cubic.main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.entities.CustomersEntity;
import com.cubic.entities.ProductsEntity;
import com.cubic.repositories.CustomersRepository;
import com.cubic.repositories.ProductsRepository;

public class InsertAndSaveMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml");
		ProductsRepository pr = (ProductsRepository) ctx.getBean("productsRepository");
		CustomersRepository cr = (CustomersRepository) ctx.getBean("customersRepository");
		
		ProductsEntity p1 = pr.getById(1);
		ProductsEntity p2 = pr.getById(2);
		
		List<ProductsEntity> products = new ArrayList<ProductsEntity>();
		products.add(p1);
		products.add(p2);
		
		CustomersEntity customers = new CustomersEntity();
		customers.setName("Bikash Thapa");
		customers.setAddress("9335 lee highway");
		customers.setPhoneNo("2523459987");
		customers.setDob("11/27/1992");
		customers.setZip_code(27804);
		customers.setUuid(UUID.randomUUID().toString());
		
		customers.setProducts(products);
		cr.save(customers);
		

	}

}
