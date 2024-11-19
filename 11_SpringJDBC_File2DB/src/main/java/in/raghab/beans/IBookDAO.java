package in.raghab.beans;

import java.util.List;

public interface IBookDAO {
	void saveBook(Integer bid,String bname,Double bprice);
	
	List<BookDTO> getBooks();
}
