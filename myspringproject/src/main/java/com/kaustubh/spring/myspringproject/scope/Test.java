package com.kaustubh.spring.myspringproject.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(
			"com/kaustubh/spring/myspringproject/scope/config.xml");
	University tc1 = (University) context.getBean("abc");
	System.out.println(tc1.hashCode());
	
	University tc3 = (University) context.getBean("abc");
	System.out.println(tc3.hashCode());
	
	}
}
