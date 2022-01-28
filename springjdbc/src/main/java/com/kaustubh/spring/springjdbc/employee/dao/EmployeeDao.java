package com.kaustubh.spring.springjdbc.employee.dao;

import java.util.List;

import com.kaustubh.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	int create(Employee employee);
	int update(Employee employee);
	int delete(Employee employee);
	Employee read(int id);
	List<Employee> readMultiple(int id);
}
