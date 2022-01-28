package com.kaustubh.spring.myspringproject.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/kaustubh/spring/myspringproject/list/listconfig.xml");
	Hospital hospital = (Hospital) context.getBean("hospital");
	System.out.println(hospital.getName());
	System.out.println(hospital.getDepartments());
	}
}
