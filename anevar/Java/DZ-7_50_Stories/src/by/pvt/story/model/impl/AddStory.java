package by.pvt.story.model.impl;

import by.pvt.story.domain.Story;
import by.pvt.story.domain.StoryList;
import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;
import by.pvt.story.model.Command;

public class AddStory implements Command {

	@Override
	public TOResponse execute(TORequest to) {
		
		Story story = new Story(to.storyName, to.ranking, to.numbToken);
		StoryList.getStories().getList().add(story);
		
		TOResponse response = new TOResponse();
		response.story=story;
				
		return response;
	}

}
