package com.kaustubh.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Dao dao = context.getBean(Dao.class);
//		dao.create();
		
		Service dao = context.getBean(Service.class);
		dao.save();
		context.close();
	}
	

}
