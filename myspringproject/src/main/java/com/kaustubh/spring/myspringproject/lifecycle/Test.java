package com.kaustubh.spring.myspringproject.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(
			"com/kaustubh/spring/myspringproject/lifecycle/config.xml");
	TicketReservation tc = (TicketReservation) context.getBean("mybean");
	System.out.println(tc.getTicketID());
	System.out.println(tc.getName());
	context.registerShutdownHook();
	
	}
}
