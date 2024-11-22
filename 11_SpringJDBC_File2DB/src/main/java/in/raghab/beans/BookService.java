package in.raghab.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import in.raghab.excel.ExcelGenerator;

public class BookService {
	private IBookDAO bookDao;
	private ExcelGenerator excelGenerator;
	
	public BookService(IBookDAO bookDao, ExcelGenerator excelGenerator) {
		super();
		this.bookDao = bookDao;
		this.excelGenerator = excelGenerator;
	}

	
	public void getBooks() throws Exception {
		List<BookDTO> books=bookDao.getBooks();
		books.forEach(System.out::println);
		
		excelGenerator.generateExcel(books);
	}

	public void storeBookData() throws Exception {
		System.out.println("Books are storing...");
		
		File file=new File("Books.txt");
		FileReader fileReader=new FileReader(file);//reads only single character
		BufferedReader bufferedReader=new BufferedReader(fileReader);//reads single line
		
		String line=bufferedReader.readLine();
		
		
		while(line != null) {
			//System.out.println(line);
			
			String[] data=line.split(",");
			Integer bid=Integer.parseInt(data[0]);
			String bname=data[1];
			Double bprice=Double.parseDouble(data[2]);
			
			bookDao.saveBook(bid, bname, bprice);
			
			line=bufferedReader.readLine();
		}
		System.out.println("Books are Inserted Successfuly in book table of springbootdb database.");
		
		bufferedReader.close();
		fileReader.close();
	}
}
