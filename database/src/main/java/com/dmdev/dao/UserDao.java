package com.dmdev.dao;

import com.dmdev.model.User;

import java.util.List;

/**
 * @author Andrey Makarov on 19.01.2023
 */
public class UserDao {

	public List<User> findAll() {
		return List.of(
			new User(1, "Ivan"),
			new User(2, "Petr"),
			new User(3, "Yana")
		);
	}
}
