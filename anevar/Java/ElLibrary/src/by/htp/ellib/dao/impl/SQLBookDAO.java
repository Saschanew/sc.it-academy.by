package by.htp.ellib.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.htp.ellib.dao.BookDAO;
import by.htp.ellib.dao.conPool.ConnectionPool;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.Book;
import by.htp.ellib.entity.criteria.Criteria;
import by.htp.ellib.entity.criteria.CriteriasBook;

public class SQLBookDAO implements BookDAO {
	
	private static final String QUERY_FIND_BOOKS = "SELECT * FROM books WHERE author = ? and year = ? and genre = ?";
	private static final String QUERY_FIND_BOOKS_A = "SELECT * FROM books WHERE author = ?";
	private static final String QUERY_FIND_BOOKS_Y = "SELECT * FROM books WHERE year = ?";
	private static final String QUERY_FIND_BOOKS_G = "SELECT * FROM books WHERE genre = ?";
	private static final String QUERY_FIND_BOOKS_A_Y = "SELECT * FROM books WHERE author = ? and year = ?";
	private static final String QUERY_FIND_BOOKS_A_G = "SELECT * FROM books WHERE author = ? and genre = ?";
	private static final String QUERY_FIND_BOOKS_Y_G = "SELECT * FROM books WHERE year = ? and genre = ?";

	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
	
	@Override
	public List<Book> find(Criteria criteria) throws ConnectionPoolException, DAOException {
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		List<Book> listBooks = new ArrayList<>();
		
		try {			
			
			con = connectionPool.takeConection();
			boolean isAuthor = false; 
			boolean isYear = false; 
			boolean isGenre = false;
						
			Book book = null;			
				
				if (criteria.getCriteria().containsKey(CriteriasBook.AUTHOR)) {	isAuthor = true;	}				
				if (criteria.getCriteria().containsKey(CriteriasBook.YEAR)) {	isYear = true;	}	
				if (criteria.getCriteria().containsKey(CriteriasBook.GENRE)) {	isGenre = true;	}	
			
			
			if (isAuthor == true && isYear == true && isGenre == true) {
				st = con.prepareStatement(QUERY_FIND_BOOKS);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.AUTHOR));
				st.setString(2, (String)criteria.getCriteria().get(CriteriasBook.YEAR));
				st.setString(3, (String)criteria.getCriteria().get(CriteriasBook.GENRE));
			} else if(isAuthor == true && isYear == true && isGenre == false) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_A_Y);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.AUTHOR));
				st.setString(2, (String)criteria.getCriteria().get(CriteriasBook.YEAR));
			} else if(isAuthor == true && isYear == false && isGenre == true) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_A_G);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.AUTHOR));
				st.setString(2, (String)criteria.getCriteria().get(CriteriasBook.GENRE));
			} else if(isAuthor == false && isYear == true && isGenre == true) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_Y_G);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.YEAR));
				st.setString(2, (String)criteria.getCriteria().get(CriteriasBook.GENRE));
			} else if(isAuthor == true && isYear == false && isGenre == false) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_A);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.AUTHOR));				
			} else if(isAuthor == false && isYear == true && isGenre == false) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_Y);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.YEAR));				
			} else if(isAuthor == false && isYear == false && isGenre == true) {
				st = con.prepareStatement(QUERY_FIND_BOOKS_G);
				st.setString(1, (String)criteria.getCriteria().get(CriteriasBook.GENRE));				
			}									
			
			rs = st.executeQuery();
			while(rs.next()) {
		    	book = createBook(rs);
		    	listBooks.add(book);
			}	
		
		} catch (SQLException e) {			
			throw new DAOException(e);
		} finally {
			connectionPool.closeConnection(rs, st, con);
		}
		return listBooks;		
	}
	
	private Book createBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setTitle(rs.getString("name"));
		book.setAuthor(rs.getString("author"));
		book.setYear(rs.getString("year"));
		book.setGenre(rs.getString("genre"));		
		return book;
	}	

}
