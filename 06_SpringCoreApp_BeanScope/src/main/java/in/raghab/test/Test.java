package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.BoyFriend;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		BoyFriend boyFriend1 = applicationContext.getBean(BoyFriend.class);
		BoyFriend boyFriend2 = applicationContext.getBean(BoyFriend.class);
		System.out.println(boyFriend1.hashCode()); 
		System.out.println(boyFriend2.hashCode());//same hashcode for singleton(EagerLoading) -> Default Bean scope
		// Diff obj for prototype bean scope
		//In Spring-Beans.xml file only BF having scope as prototype but i did not set in GF so GF bean having default bean scope
		
		//boyFriend1.doYouMarryWithMe(false, true);//I have no Money but I have lot of love for u
		boyFriend2.doYouMarryWithMe(true, true);//I have both Mony and love
		
		/*
		 *  ------------------
			request & session
			------------------
 These 2 scopes are belongs to spring web mvc module.
*/
	}

}
