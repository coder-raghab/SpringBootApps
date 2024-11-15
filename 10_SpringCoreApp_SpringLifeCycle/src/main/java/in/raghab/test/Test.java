package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.Motor;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("spring.xml");
		
		applicationContext.getBean(Motor.class).work();
		
		ConfigurableApplicationContext configurableApplicationContext=
				(ConfigurableApplicationContext)applicationContext;
		
		/*  
		 *  when JVM shut down that time bean objects are destroyed by IOC container because
			IOC don't know when it will be getting killed.
		 	But we want to tell the IOC before JVM shut down and we want some final activity
		 	in destroy method(here stop())
		 	But ApplicationContext doesn't having any close() or destroy kind of thing so
		 	we need to type cast in ConfigurableApplicationContext, it having close() method.
		*/
		
		configurableApplicationContext.close();

	}

}
