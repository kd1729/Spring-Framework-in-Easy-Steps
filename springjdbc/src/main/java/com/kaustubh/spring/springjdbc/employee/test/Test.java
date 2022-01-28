package com.kaustubh.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kaustubh.spring.springjdbc.employee.dao.EmployeeDao;
import com.kaustubh.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kaustubh/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = 	(EmployeeDao) context.getBean("EmployeeDao");
	   
		Employee employee = new Employee();
		
//		int result = dao.delete(employee);
//		System.out.println("Number of records deleted are : " + result);

//		int result = dao.update(employee);
//		System.out.println("Number of records updated are : " + result);
		
//		int result = dao.create(employee);
//	   System.out.println("Number of records inserted are : " + result);
		
		
//	   Employee e = dao.read(2);
//	   System.out.println("Employee Record : "+ e);

		List<Employee> result = dao.readMultiple(1);
		System.out.println(result);
	}

}
