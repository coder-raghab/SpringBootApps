package com.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghab.bean.UserService;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.saveUser("Raghab","123",12345698L);
	}

}
