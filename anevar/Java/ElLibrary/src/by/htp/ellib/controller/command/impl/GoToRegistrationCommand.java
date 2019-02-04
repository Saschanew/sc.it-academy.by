package by.htp.ellib.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ellib.controller.command.Command;

public class GoToRegistrationCommand implements Command {
	
	private static final String REGISTRATION_PAGE = "/WEB-INF/jsp/registration.jsp";

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher(REGISTRATION_PAGE);
		dispatcher.forward(request, response);
		
	}

}
