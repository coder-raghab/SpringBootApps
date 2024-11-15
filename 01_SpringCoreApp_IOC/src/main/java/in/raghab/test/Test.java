package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.bean.DieselEngine;
import in.raghab.bean.PetrolEngine;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test class Main method running..");
		
		//Start or Activate IOC container by creating IOC container object
		@SuppressWarnings("resource")
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("Beans.xml");
		
		
		//Creating objects of my Bean classes
		DieselEngine dieselEngine = applicationContext.getBean(DieselEngine.class);
		dieselEngine.startEngine();
		
		PetrolEngine petrolEngine = applicationContext.getBean(PetrolEngine.class);
		petrolEngine.startEngine();
	}

}
