package by.htp.ellib.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ellib.controller.command.Command;
import by.htp.ellib.entity.User;
import by.htp.ellib.service.ClientService;
import by.htp.ellib.service.ServiceProvider;
import by.htp.ellib.service.exceptions.ServiceException;

public class AuthorizationCommand implements Command {
	
	private static final String PARAMETER_LOGIN = "login";
	private static final String PARAMETER_PASSWORD = "password";
	
	private static final String MAIN_PAGE = "/WEB-INF/jsp/main.jsp";
	private static final String INDEX_PAGE = "/index.jsp";
	
	ServiceProvider serviceProvider = ServiceProvider.getInstance();
	
	ClientService clientService = serviceProvider.getClientService();
	
	User user = new User();

	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String login, password;
		login = request.getParameter(PARAMETER_LOGIN);
		password = request.getParameter(PARAMETER_PASSWORD);		
		
		String page="";
		
		try {
			user = clientService.authentification(login, password);
			if(user == null) {
				request.setAttribute("error", "Login or Password error");
			}else {
			request.setAttribute("userName", user.getName().toUpperCase());
			request.setAttribute("user", user);
			page=MAIN_PAGE;
			}
		} catch (ServiceException e) {
			request.setAttribute("error", "Login or Password error");
			//log
			page=INDEX_PAGE;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}
