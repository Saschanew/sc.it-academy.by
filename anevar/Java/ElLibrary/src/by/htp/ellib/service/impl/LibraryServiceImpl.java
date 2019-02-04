package by.htp.ellib.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.ellib.dao.BookDAO;
import by.htp.ellib.dao.DAOProvider;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.Book;
import by.htp.ellib.entity.criteria.Criteria;
import by.htp.ellib.service.LibraryService;
import by.htp.ellib.service.exceptions.ServiceException;

public class LibraryServiceImpl implements LibraryService {
	
	DAOProvider daoProvider = DAOProvider.getInstance();
	BookDAO bookDAO = daoProvider.getBookDAO();

	@Override
	public List<Book> find(Criteria criteria) throws ServiceException {
		
		List<Book> books = new ArrayList<>();
		try {
			books=bookDAO.find(criteria);
		} catch (ConnectionPoolException e) {
			throw new ServiceException(e);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return books;
	}

}
