package by.pvt.story.model.impl;

import java.util.ArrayList;
import java.util.List;

import by.pvt.story.domain.CompareByNumbToken;
import by.pvt.story.domain.Story;
import by.pvt.story.domain.StoryList;
import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;
import by.pvt.story.model.Command;

public class FindByNumbToken implements Command{

	@Override
	public TOResponse execute(TORequest to) {
		
		CompareByNumbToken comp = new CompareByNumbToken();
		
		StoryList.getStories().getList().sort(comp);
		
	    List<Story> tempSum = new ArrayList<>();
		int sum = 0;		
		for (int i = 0; i < StoryList.getStories().getList().size(); i++) {
			if (sum+StoryList.getStories().getList().get(i).getNumbToken()<to.numbTokenSelect) {			
				tempSum.add(StoryList.getStories().getList().get(i));
				sum+=StoryList.getStories().getList().get(i).getNumbToken();
			}
			
		}
		
		TOResponse response = new TOResponse();
		
		response.stories=tempSum;
		
		return response;
		
	}

}
