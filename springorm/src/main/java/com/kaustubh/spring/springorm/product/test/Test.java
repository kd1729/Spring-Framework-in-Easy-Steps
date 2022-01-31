package com.kaustubh.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaustubh.spring.springorm.product.dao.ProductDao;
import com.kaustubh.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kaustubh/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");

		/*
		 * Product product = new Product(); product.setId(1); product.setName("IPhone");
		 * product.setDesc("My favourite!!"); product.setPrice(1400);
		 * productDao.create(product);
		 * 
		 * product.setId(2); product.setName("Legion Laptop");
		 * product.setDesc("Gmaing!!"); product.setPrice(50000);
		 * productDao.create(product);
		 * 
		 * product.setId(3); product.setName("JBL Headphones");
		 * product.setDesc("Omggg !"); product.setPrice(1999);
		 * productDao.create(product);
		 * 
		 * productDao.update(product); productDao.delete(product);
		 * 
		 * Product product = productDao.find(2); System.out.println(product);
		 */
		
		List<Product> products = productDao.findAll();
		System.out.println(products);
	}

}
