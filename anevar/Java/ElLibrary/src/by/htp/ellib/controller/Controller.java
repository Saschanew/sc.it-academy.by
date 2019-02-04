package by.htp.ellib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ellib.controller.command.Command;
import by.htp.ellib.controller.command.CommandNames;
import by.htp.ellib.controller.command.CommandProvider;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*ServiceProvider serviceProvider = ServiceProvider.getInstance();
	
	ClientService clientService = serviceProvider.getClientService();*/
	
	private static final String PARAMETER_COMMAND = "command";
	
	private final CommandProvider provider = new CommandProvider();
	
	/*User user = new User();*/
       
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String commandStr = request.getParameter(PARAMETER_COMMAND);
		Command command = provider.getCommand(CommandNames.valueOf(commandStr.toUpperCase()));
		
		command.execute(request, response);
		
		/*PrintWriter out = response.getWriter();
		
		String login, password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		
		try {
			user = clientService.authentification(login, password);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		out.println(user.toString()); */
		
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
