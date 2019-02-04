package by.htp.ellib.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.ellib.controller.command.impl.AuthorizationCommand;
import by.htp.ellib.controller.command.impl.FindBookCommand;
import by.htp.ellib.controller.command.impl.GoToRegistrationCommand;
import by.htp.ellib.controller.command.impl.RegistrationCommand;

public class CommandProvider {
	
	private Map<CommandNames, Command> commands = new HashMap<CommandNames, Command>();
	
	public CommandProvider () {
		commands.put(CommandNames.AUTHORIZATION, new AuthorizationCommand());
		commands.put(CommandNames.GO_TO_REGISTRATION, new GoToRegistrationCommand());
		commands.put(CommandNames.REGISTRATION, new RegistrationCommand());
		commands.put(CommandNames.FIND_BOOKS, new FindBookCommand());
	}

	public Command getCommand(CommandNames command) {
		
		return commands.get(command);
		
	}
}
