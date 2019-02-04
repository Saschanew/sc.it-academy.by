package by.htp.ellib.service.impl;

import by.htp.ellib.dao.DAOProvider;
import by.htp.ellib.dao.UserDAO;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.User;
import by.htp.ellib.entity.UserData;
import by.htp.ellib.service.ClientService;
import by.htp.ellib.service.exceptions.ServiceException;
import by.htp.ellib.service.validation.CredentionalValidator;

public class ClientServiceImpl implements ClientService {
	
	DAOProvider daoProvider = DAOProvider.getInstance();
	UserDAO userDAO = daoProvider.getUserDAO();

	public User authentification(String login, String password) throws ServiceException {
		
		if(!CredentionalValidator.isCorrect(login, password)) {
			
			throw new ServiceException();
			
		}		
		
		User user=new User();
		try {
			user = userDAO.authentification(login, password);
		} catch (DAOException e) {			
			throw new ServiceException(e);
		} catch (ConnectionPoolException e) {
			throw new ServiceException(e);
		}
			
		return user;
	}

	public boolean registration(UserData userData) throws ServiceException {
		try {
			userDAO.registration(userData);
		} catch (DAOException e) {
			throw new ServiceException(e);
		} catch (ConnectionPoolException e) {
			throw new ServiceException(e);
		}
		return true;
	}

}
