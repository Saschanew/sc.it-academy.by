package by.htp.ellib.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import by.htp.ellib.dao.conPool.ConnectionPool;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;

public class Main {
	
	private static final String QUERY_ADD_BOOK = "INSERT INTO books (name, year, autor, genre) VALUES(?, ?, ?, ?)";

	public static void main(String[] args) throws ConnectionPoolException, SQLException {

     ConnectionPool pool = ConnectionPool.getInstance();
     
     Connection con = pool.takeConection();
     
     PreparedStatement st = con.prepareStatement(QUERY_ADD_BOOK);
     
     st.setString(1, "Evgenij Onegin");  st.setString(2, "1982");  st.setString(3, "Pushkin");  st.setString(4, "Classik");
	 st.executeUpdate();
	 
	 st.setString(1, "Harry Potter");  st.setString(2, "2014");  st.setString(3, "Rouling");  st.setString(4, "Fantastic");
	 st.executeUpdate();
	 
	 st.setString(1, "Idiot");  st.setString(2, "2005");  st.setString(3, "Tolstoj");  st.setString(4, "Classik");
	 st.executeUpdate();
	 
	 st.setString(1, "Revisor");  st.setString(2, "1994");  st.setString(3, "Gogol");  st.setString(4, "Classik");
	 st.executeUpdate();
	 
	 st.setString(1, "Star Wars");  st.setString(2, "2004");  st.setString(3, "Spilberg");  st.setString(4, "Fantastic");
	 st.executeUpdate();
	 
	 st.setString(1, "Oblomov");  st.setString(2, "2012");  st.setString(3, "Goncharov");  st.setString(4, "Classik");
	 st.executeUpdate();
	 
	 pool.closeConnection(st, con);

	}

}
