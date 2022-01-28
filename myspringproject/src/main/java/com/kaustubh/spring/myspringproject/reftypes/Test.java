package com.kaustubh.spring.myspringproject.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kaustubh/spring/myspringproject/reftypes/config.xml");
		ShoppingCart sc = (ShoppingCart) context.getBean("cart");
		System.out.println(sc);
	}

}
