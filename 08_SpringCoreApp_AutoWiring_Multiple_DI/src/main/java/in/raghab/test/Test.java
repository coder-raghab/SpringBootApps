package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("beans.xml");
		
		applicationContext.getBean(UserService.class).userRegistration();
	}

}
