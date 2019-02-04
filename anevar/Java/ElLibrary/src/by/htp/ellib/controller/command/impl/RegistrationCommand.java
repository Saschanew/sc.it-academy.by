package by.htp.ellib.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ellib.controller.command.Command;
import by.htp.ellib.entity.UserData;
import by.htp.ellib.service.ClientService;
import by.htp.ellib.service.ServiceProvider;
import by.htp.ellib.service.exceptions.ServiceException;

public class RegistrationCommand implements Command {
	
	private static final String PARAMETER_NAME = "name";
	private static final String PARAMETER_SURNAME = "surname";
	private static final String PARAMETER_ADRESS = "adress";
	private static final String PARAMETER_EMAIL = "email";
	private static final String PARAMETER_LOGIN_REG = "loginReg";
	private static final String PARAMETER_PASSWORD_REG = "passwordReg";
	private static final String PARAMETER_PASSWORD_REPEAT = "password2";
	
	private static final String INDEX_PAGE = "/index.jsp";
		
	ServiceProvider serviceProvider = ServiceProvider.getInstance();
	
	ClientService clientService = serviceProvider.getClientService();
	
	UserData userData = new UserData();	

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String name, surname, adress, email, login, password, passwordRepeat;	
	
	name = request.getParameter(PARAMETER_NAME);
	surname = request.getParameter(PARAMETER_SURNAME);
	adress = request.getParameter(PARAMETER_ADRESS);
	email = request.getParameter(PARAMETER_EMAIL);
	login = request.getParameter(PARAMETER_LOGIN_REG);
	password = request.getParameter(PARAMETER_PASSWORD_REG);
	passwordRepeat = request.getParameter(PARAMETER_PASSWORD_REPEAT);
	
	userData.setName(name);
	userData.setSurname(surname);
	userData.setAdress(adress);
	userData.setEmail(email);
	userData.setLogin(login);
	userData.setPassword(password);
	userData.setPasswordRepeat(passwordRepeat);
	
	boolean ok=false;
	try {
		ok = clientService.registration(userData);
	} catch (ServiceException e) {
		request.setAttribute("error", "Login or Password error");
		e.printStackTrace();
	}
	
	if (ok == true) {
		RequestDispatcher dispatcher = request.getRequestDispatcher(INDEX_PAGE);
		dispatcher.forward(request, response);
	}
		
	}

}
