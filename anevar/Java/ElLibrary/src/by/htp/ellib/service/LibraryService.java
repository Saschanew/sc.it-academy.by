package by.htp.ellib.service;

import java.util.List;

import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.Book;
import by.htp.ellib.entity.criteria.Criteria;
import by.htp.ellib.service.exceptions.ServiceException;

public interface LibraryService {
	
	List<Book> find(Criteria criteria) throws ServiceException;

}
