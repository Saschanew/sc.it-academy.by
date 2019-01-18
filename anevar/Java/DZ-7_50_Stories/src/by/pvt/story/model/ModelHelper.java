package by.pvt.story.model;

import java.util.HashMap;
import java.util.Map;

import by.pvt.story.model.impl.AddStory;
import by.pvt.story.model.impl.FindByHighestRanking;
import by.pvt.story.model.impl.FindByNumbToken;
import by.pvt.story.model.impl.ShowAll;

public class ModelHelper {
	private Map<String, Command> commands = new HashMap<>();
	
	public ModelHelper() {
		
		commands.put("INPUT_NEW_STORY", new AddStory());
		commands.put("INPUT_FIND_ALL", new ShowAll());		
		commands.put("FIND_BY_HIGHEST_RANKING", new FindByHighestRanking());
		commands.put("FIND_BY_NUMB_TOKEN", new FindByNumbToken());
		
	}
	
	public Command getCommand(String commandName) {
		return commands.get(commandName);
	}

}
