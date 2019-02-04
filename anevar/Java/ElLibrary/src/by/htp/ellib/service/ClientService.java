package by.htp.ellib.service;

import by.htp.ellib.entity.User;
import by.htp.ellib.entity.UserData;
import by.htp.ellib.service.exceptions.ServiceException;

public interface ClientService {
	
	User authentification(String login, String password) throws ServiceException;
	
	boolean registration (UserData userData) throws ServiceException;
	
}


