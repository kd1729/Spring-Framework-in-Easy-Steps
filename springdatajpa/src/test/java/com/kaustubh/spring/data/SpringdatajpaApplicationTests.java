package com.kaustubh.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.kaustubh.spring.data.entities.Product;
import com.kaustubh.spring.data.repos.ProductRepo;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void saveProduct() {
		ProductRepo repo = context.getBean(ProductRepo.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("awesome");
		product.setPrice(12000d);
		repo.save(product);
		
		Optional<Product> prodOptional = repo.findById((long) 1);
		if(prodOptional.isPresent()) {
				Product p = prodOptional.get();
				System.out.println(p);
		}
	}

}
