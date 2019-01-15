package by.pvt.treasure.controller;

import java.util.HashMap;
import java.util.Map;

import by.pvt.treasure.controller.impl.AddTreasure;
import by.pvt.treasure.controller.impl.HighestValueTreasure;
import by.pvt.treasure.controller.impl.SelectTreasures;
import by.pvt.treasure.controller.impl.ShowAllTreasure;

public class CommandProvider {
	
	private final Map<CommandName, Command> repository = new HashMap<>();
	
	public CommandProvider() {
		repository.put(CommandName.ADD_TREASURE, new AddTreasure());
		repository.put(CommandName.SELECT_TREASURES, new SelectTreasures());
		repository.put(CommandName.SHOW_ALL_TREASURE, new ShowAllTreasure());
		repository.put(CommandName.SHOW_HIGHEST_VALUE_TREASURE, new HighestValueTreasure());
	}
	
	public Command getCommand (String name){
		
		CommandName commandName = null;
		Command command = null;
		
		commandName = CommandName.valueOf(name.toUpperCase());
		command = repository.get(commandName);
		
		return command;
	}
	
	
}
