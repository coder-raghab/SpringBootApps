package in.raghab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.db1.entity.Book;
import in.raghab.db1.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	
	public void saveBook() {
		Book book=new Book();
		book.setBookName("Java");
	    
		bookRepo.save(book);
	
	}
}
