package in.raghab.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.raghab.mapper.BookRowMapper;

public class BookDAOImpl implements IBookDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBook(Integer bid, String bname, Double bprice) {
		String sql="INSERT INTO BOOK VALUES(?,?,?)";
		
		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bid);
			ps.setString(2, bname);
			ps.setDouble(3, bprice);
		});
	}

	@Override
	public List<BookDTO> getBooks() {
		String sql="SELECT * FROM BOOK";
		List<BookDTO> books=jdbcTemplate.query(sql, new BookRowMapper());
		return books;
	}
	
}
