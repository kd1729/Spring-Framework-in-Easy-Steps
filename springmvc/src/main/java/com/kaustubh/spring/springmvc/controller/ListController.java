package com.kaustubh.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kaustubh.spring.springmvc.dto.Employee;

@Controller 
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee1 = new Employee();
		employee1.setId(123);
		employee1.setName("Kaustubh");
		employee1.setSalary(1000000);
		
		Employee employee2 = new Employee();
		employee2.setId(456);
		employee2.setName("Tanmay");
		employee2.setSalary(2000000);

		Employee employee3 = new Employee();
		employee3.setId(789);
		employee3.setName("Soumyaraj");
		employee3.setSalary(3000000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
