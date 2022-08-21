package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class UserService {

	public List<String> getUsers() {

		List<String> users = new ArrayList<>();
		users.add("Femina");
		
		
		users.add("Arju2");

		return users;
	}

	public List<String> getNewUsers4() {

		List<String> users = new ArrayList<>();
		users.add("TEST1");

		return users;
	}

	public List<String> getCompany() {

		List<String> company = new ArrayList<>();
		company.add("IBM1");
		company.add("IBM2");
		return company;
	}

}
