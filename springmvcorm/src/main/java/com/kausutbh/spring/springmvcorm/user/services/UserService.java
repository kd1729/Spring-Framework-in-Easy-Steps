package com.kausutbh.spring.springmvcorm.user.services;

import java.util.List;

import com.kausutbh.spring.springmvcorm.user.entity.User;

public interface UserService {
	
	int save(User user);
	List<User> getUsers();
	
}
