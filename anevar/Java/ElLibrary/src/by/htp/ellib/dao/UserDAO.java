package by.htp.ellib.dao;

import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.User;
import by.htp.ellib.entity.UserData;

public interface UserDAO {
	
	User authentification(String login, String password) throws DAOException, ConnectionPoolException;
	
	boolean registration (UserData userdata) throws DAOException, ConnectionPoolException;
		
}
