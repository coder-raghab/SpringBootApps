package in.raghab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.raghab.beans.BookService;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("spring.xml");
		
		BookService bookService = applicationContext.getBean(BookService.class);
		
		//bookService.storeBookData();
		bookService.getBooks();

	}

}
