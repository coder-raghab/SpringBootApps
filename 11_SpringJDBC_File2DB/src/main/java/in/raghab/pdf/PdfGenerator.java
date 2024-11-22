/*Not Updated---Ignore this file
 * 
 * 
package in.raghab.pdf;


import java.util.List;


import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import in.raghab.beans.BookDTO;

public class PdfGenerator {
	public void exportPdf(List<BookDTO> books) throws Exception{
		
		PdfPTable table = new PdfPTable(3);
		
		for(BookDTO book:books) {
			PdfPCell cell1= new PdfPCell();
			cell1.addElement(new Paragraph(book.getBookId()));
			table.addCell(cell1);
			
			PdfPCell cell2 = new PdfPCell();
			cell2.addElement(new Paragraph(book.getBookName()));
			table.addCell(cell2);
			
			PdfPCell cell3 = new PdfPCell();
			cell3.addElement(new Paragraph(new String(""+book.getBookPrice())));
			table.addCell(cell3);
		}
		
		
	}
    
}
*/

