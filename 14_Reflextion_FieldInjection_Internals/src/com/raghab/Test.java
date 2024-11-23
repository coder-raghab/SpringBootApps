package com.raghab;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception{
		//User user=new User();
		//Integer age=user.age;
		
		Class<?> forName = Class.forName("com.raghab.User");
		
		Field field=forName.getDeclaredField("age");
		
		field.setAccessible(true);
		
		@SuppressWarnings("deprecation")
		User user=(User)forName.newInstance();
		
		field.set(user, 22);
		
		user.getAge();
	}

}