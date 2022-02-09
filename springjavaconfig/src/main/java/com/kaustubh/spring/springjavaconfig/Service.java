package com.kaustubh.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Service {
	@Autowired
	Dao dao;

		
	public void init() {
		System.out.println("inside init method ! ");
	}
	
	public void destroy() {
		System.out.println("inside destroy method ! ");
	}
	
	@Bean
	public void save() {
		dao.create();
	}
}
