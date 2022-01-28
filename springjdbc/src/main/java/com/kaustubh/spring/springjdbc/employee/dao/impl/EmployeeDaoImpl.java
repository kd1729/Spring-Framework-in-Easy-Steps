package com.kaustubh.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kaustubh.spring.springjdbc.employee.dao.EmployeeDao;
import com.kaustubh.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.kaustubh.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getLastName(), employee.getId());
		return result;
	}
	
	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where firstname=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return emp;
	}
	
	@Override
	public List<Employee> readMultiple(int id) {
		String sql = "select * from employee where id<>?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper, id);
		return result;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

}
