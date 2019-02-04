package by.htp.ellib.dao;

import java.util.List;

import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.Book;
import by.htp.ellib.entity.criteria.Criteria;

public interface BookDAO {
	
	List<Book> find (Criteria criteria) throws ConnectionPoolException, DAOException;

}
