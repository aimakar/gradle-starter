package com.dmdev.service;

import com.dmdev.dao.UserDao;
import com.dmdev.model.User;

import java.util.List;

/**
 * @author Andrey Makarov on 19.01.2023
 */
public class UserService {

	private final UserDao userDao = new UserDao();

	public List<User> getAll() {
		return userDao.findAll();
	}
}
