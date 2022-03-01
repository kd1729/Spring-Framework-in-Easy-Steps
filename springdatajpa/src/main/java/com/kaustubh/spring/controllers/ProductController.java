package com.kaustubh.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaustubh.spring.data.entities.Product;
import com.kaustubh.spring.data.repos.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepo repo;
	
	@GetMapping
	public Iterable<Product> getProducts(){
		return repo.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		 Optional<Product> temp = repo.findById(id);
		 if(temp.isPresent()) {
			Product product = temp.get();
			return product;
		}
		 return null;	 
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable Long id) {
		repo.deleteById(id);
		return null;
	}
	
}
