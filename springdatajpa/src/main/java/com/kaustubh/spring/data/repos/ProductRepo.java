package com.kaustubh.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.kaustubh.spring.data.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
	
	

}
