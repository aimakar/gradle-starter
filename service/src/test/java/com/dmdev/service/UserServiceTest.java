package com.dmdev.service;

import com.dmdev.dao.UserDao;
import com.dmdev.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andrey Makarov on 19.01.2023
 */
class UserServiceTest {
	private final UserService userService = new UserService();

	@Test
	void getAll() {
		List<User> actual = userService.getAll();
		assertEquals(3, actual.size());
	}
}