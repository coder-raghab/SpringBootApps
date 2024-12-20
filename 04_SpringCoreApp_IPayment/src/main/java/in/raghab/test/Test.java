package in.raghab.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.Restaurant;

public class Test {

	public static void main(String[] args) {
		System.out.println("Start of Main Method");
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		try {
			System.out.print("Enter the Payment Method::1)Debit Card\t2)Credit Card\t3)UPI=> ");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				applicationContext.getBean("restaurantDebit", Restaurant.class).bill();
				break;
			case 2:
				applicationContext.getBean("restaurantCredit", Restaurant.class).bill();
				break;
			case 3:
				applicationContext.getBean("restaurantUpi", Restaurant.class).bill();
				break;
			default:
				System.out.println("You entered invalid input!!");
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println("End of Main Method");
	}

}
