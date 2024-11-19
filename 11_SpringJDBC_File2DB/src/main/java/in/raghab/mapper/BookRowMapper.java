package in.raghab.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.raghab.beans.BookDTO;

public class BookRowMapper implements RowMapper<BookDTO> {

	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookDTO bookDto=new BookDTO();
		bookDto.setBookId(rs.getInt(1));
		bookDto.setBookName(rs.getString(2));
		bookDto.setBookPrice(rs.getDouble(3));
		
		return bookDto;
	}
	
}
