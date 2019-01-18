package by.pvt.story.view;

import java.util.HashMap;
import java.util.Map;

import by.pvt.story.view.output.OutputListStories;
import by.pvt.story.view.output.OutputListStoriesSelect;
import by.pvt.story.view.output.OutputStory;
import by.pvt.story.view.output.ViewOutputCommand;

public class ViewOutputHelper {
	private Map<String, ViewOutputCommand> commands = new HashMap<>();

	public ViewOutputHelper() {
		
		commands.put("INPUT_NEW_STORY", new OutputStory());
		commands.put("INPUT_FIND_ALL", new OutputListStories());
		commands.put("FIND_BY_HIGHEST_RANKING", new OutputStory());
		commands.put("FIND_BY_NUMB_TOKEN", new OutputListStoriesSelect());
	}
	
	
	public ViewOutputCommand getCommand(String commandName) {
		return commands.get(commandName);
	}
}
