package com.kausutbh.spring.springmvcorm.user.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kausutbh.spring.springmvcorm.user.dao.UserDao;
import com.kausutbh.spring.springmvcorm.user.entity.User;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// Business Logic
		return dao.create(user);		
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}
}
