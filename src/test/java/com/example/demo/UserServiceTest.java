package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class) class UserServiceTest {

	@InjectMocks UserService userService;

	@Test public void addUser() {

		List<String> users = userService.getUsers();
	}

	@Test public void addUserNew() {

		List<String> users = userService.getNewUsers();
		Assert.assertEquals(users.size(), 2);
	}

}
