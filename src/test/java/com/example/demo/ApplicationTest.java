package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class) public class ApplicationTest {

	@Autowired DemoApplication application;

	@Test public void testMain() {
		application.main(new String[] { "a" });
	}

}
