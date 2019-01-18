package by.pvt.story.model.impl;

import by.pvt.story.domain.CompareByRanking;
import by.pvt.story.domain.Story;
import by.pvt.story.domain.StoryList;
import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;
import by.pvt.story.model.Command;

public class FindByHighestRanking implements Command{

	@Override
	public TOResponse execute(TORequest to) {
				
		CompareByRanking comp = new CompareByRanking();
		
	    StoryList.getStories().getList().sort(comp);
		
		Story highestRankingStory = StoryList.getStories().getList().get(StoryList.getStories().getList().size()-1);
		
		TOResponse response = new TOResponse();
		
		response.story=highestRankingStory;
		
		return response;
	}

}
