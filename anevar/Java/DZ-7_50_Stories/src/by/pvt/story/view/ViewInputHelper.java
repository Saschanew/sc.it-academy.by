package by.pvt.story.view;

import java.util.HashMap;
import java.util.Map;

import by.pvt.story.view.input.InputFindAll;
import by.pvt.story.view.input.InputFindHighestRanking;
import by.pvt.story.view.input.InputFindNumberToken;
import by.pvt.story.view.input.InputForNewStory;
import by.pvt.story.view.input.MainMenu;
import by.pvt.story.view.input.ViewInputCommand;

public class ViewInputHelper {
	private Map<String, ViewInputCommand> commands = new HashMap<>();

	public ViewInputHelper() {
		
		commands.put("INPUT_MAIN_MENU", new MainMenu());
		
		commands.put("INPUT_NEW_STORY", new InputForNewStory());
		commands.put("INPUT_FIND_ALL", new InputFindAll());
		commands.put("FIND_BY_HIGHEST_RANKING", new InputFindHighestRanking());
		commands.put("FIND_BY_NUMB_TOKEN", new InputFindNumberToken());
		
	}
	
	public ViewInputCommand getCommand(String commandName) {
		return commands.get(commandName);
	}
}
