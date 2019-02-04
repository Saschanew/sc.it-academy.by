package by.htp.ellib.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.htp.ellib.dao.UserDAO;
import by.htp.ellib.dao.conPool.ConnectionPool;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.User;
import by.htp.ellib.entity.UserData;

public class SQLUserDAO extends SqlDao implements UserDAO {
	
	private static final String QUERY_CHECK_CREDENTIONALS = "SELECT * FROM users WHERE login = ? and password = ?";
	private static final String QUERY_ADD_USER = "INSERT INTO users (name_user, surname, email, login, password) VALUES(?, ?, ?, ?, ?)";
	private static final String QUERY_ADD_USER_DATA = "INSERT INTO user_details (name, surname, adress, email, login, password) VALUES(?, ?, ?, ?, ?, ?)";
	
	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

	public User authentification(String loginUser, String passwordUser) throws DAOException, ConnectionPoolException{
			
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		User user = null;
				
		try {
			//con = DriverManager.getConnection(url, SQLUserDAO.login, SQLUserDAO.password);
			
			con = connectionPool.takeConection();
						
		    st = con.prepareStatement(QUERY_CHECK_CREDENTIONALS);
		  		    
		    st.setString(1, loginUser);
		    st.setString(2, passwordUser);
		    
		    rs = st.executeQuery();
		    
		    if (rs.next()) {
		    	user = createUser(rs);
			}
		    
		} catch (SQLException e) {			
			throw new DAOException(e);
		} finally {
			connectionPool.closeConnection(rs, st, con);
		}
		return user;		
	}
	
	private User createUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name_user"));
		user.setSurname(rs.getString("surname"));
		user.setEmail(rs.getString("email"));
		user.setLogin(rs.getString("login"));
		user.setPassword(rs.getString("password"));
		return user;
	}	

	public boolean registration(UserData userData) throws DAOException, ConnectionPoolException {
		
		Connection con = null;
		PreparedStatement st = null;
				
		try {			
			
			con = connectionPool.takeConection();
			
			con.setAutoCommit(false);
			
		    st = con.prepareStatement(QUERY_ADD_USER);		  		    
		    
		    st.setString(1, userData.getName());
		    st.setString(2, userData.getSurname());
		    st.setString(3, userData.getEmail());
		    st.setString(4, userData.getLogin());
		    st.setString(5, userData.getPassword());
		    
		    st.execute();
		    
		    st = con.prepareStatement(QUERY_ADD_USER_DATA);
		    
		    st.setString(1, userData.getName());
		    st.setString(2, userData.getSurname());
		    st.setString(3, userData.getAdress());
		    st.setString(4, userData.getEmail());
		    st.setString(5, userData.getLogin());
		    st.setString(6, userData.getPassword());
		    
		    st.execute();		    
		    
		    con.commit();
		   		    
		} catch (SQLException e) {	
			try {
				con.rollback();
			} catch (SQLException e1) {
				throw new DAOException(e);
			}
			throw new DAOException(e);
		} finally {
			connectionPool.closeConnection(st, con);
		}
				
		return true;
	}


	
}
