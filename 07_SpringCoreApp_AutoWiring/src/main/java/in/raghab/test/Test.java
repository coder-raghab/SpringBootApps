package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.ATM;
import in.raghab.beans.Computer;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		applicationContext.getBean(ATM.class).withdraw();
		applicationContext.getBean(Computer.class).printRequest();
		

	}

}
