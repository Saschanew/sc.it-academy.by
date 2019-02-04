package by.htp.ellib.controller.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ellib.controller.command.Command;
import by.htp.ellib.dao.exceptions.ConnectionPoolException;
import by.htp.ellib.dao.exceptions.DAOException;
import by.htp.ellib.entity.Book;
import by.htp.ellib.entity.criteria.Criteria;
import by.htp.ellib.entity.criteria.CriteriasBook;
import by.htp.ellib.service.LibraryService;
import by.htp.ellib.service.ServiceProvider;
import by.htp.ellib.service.exceptions.ServiceException;

public class FindBookCommand implements Command {
	
	private static final String PARAMETER_AUTHOR = "author";
	private static final String PARAMETER_GENRE = "genre";
	private static final String PARAMETER_YEAR = "year";
	
	private static final String FIND_BOOK_PAGE = "/WEB-INF/jsp/displayBooks.jsp";
	private static final String MAIN_PAGE = "/WEB-INF/jsp/main.jsp";
	
	ServiceProvider provider = ServiceProvider.getInstance();
	LibraryService service = provider.getLibraryService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String author, genre, year;
		String page="";
		
		author = request.getParameter(PARAMETER_AUTHOR);
		genre = request.getParameter(PARAMETER_GENRE);
		year = request.getParameter(PARAMETER_YEAR);

		Criteria criteria = new Criteria();	
		if (author != "") {	criteria.add(CriteriasBook.AUTHOR, author);	}
		if (genre != "") {	criteria.add(CriteriasBook.GENRE, genre);	}
		if (year != "") {	criteria.add(CriteriasBook.YEAR, year);	}
		
		List<Book> books=null;
		try{
			books = service.find(criteria);
			if (books.size() == 0) {
				request.setAttribute("error2", "Нет таких книг");
				page=MAIN_PAGE;
			}else {			
			request.setAttribute("books", books);			
			page=FIND_BOOK_PAGE;
			}
		} catch (ServiceException e) {
			request.setAttribute("error2", "Нет таких книг");
			//log
			page=MAIN_PAGE;
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}
