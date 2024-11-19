package in.raghab.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import in.raghab.beans.BookDTO;

public class ExcelGenerator {
	public void generateExcel(List<BookDTO> books) throws Exception {
		Workbook workbook=new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Book-Data");
		
		Row headerRow = sheet.createRow(0);
		
		headerRow.createCell(0).setCellValue("BOOK_ID");
		headerRow.createCell(1).setCellValue("BOOK_NAME");
		headerRow.createCell(2).setCellValue("BOOK_PRICE");
		
		int dataRowIndex=1;
		for(BookDTO b : books) {
			Row dataRow=sheet.createRow(dataRowIndex);
			
			dataRow.createCell(0).setCellValue(b.getBookId());
			dataRow.createCell(1).setCellValue(b.getBookName());
			dataRow.createCell(2).setCellValue(b.getBookPrice());
			
			dataRowIndex++;
		}
		
		File file=new File("Books.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		
	}
}
