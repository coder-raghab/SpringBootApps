package com.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghab.beans.Car;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Car car = applicationContext.getBean(Car.class);
		
		car.drive();

	}

}
