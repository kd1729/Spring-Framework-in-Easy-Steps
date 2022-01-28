package com.kaustubh.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kaustubh/spring/springjdbc/config.xml");
	   JdbcTemplate jdbcTemplate = 	(JdbcTemplate) context.getBean("jdbcTemplate");
	   String sql="insert into employee values(?, ?, ?)";
	   int result = jdbcTemplate.update(sql, new Integer(1), "Kaustubh", "Dwivedi");
	   System.out.println("Number of records inserted are : " + result);

	}

}
