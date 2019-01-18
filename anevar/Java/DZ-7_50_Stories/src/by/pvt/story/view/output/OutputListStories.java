package by.pvt.story.view.output;

import by.pvt.story.domain.Story;
import by.pvt.story.domain.StoryList;
import by.pvt.story.domain.TOResponse;

public class OutputListStories implements ViewOutputCommand{

	@Override
	public void output(TOResponse response) {
		
		response.stories = StoryList.getStories().getList();
		System.out.println("Сказки:");
		for (Story story : response.stories) {
			System.out.println(story.toString());
		}
		
		if (StoryList.getStories().getList().size()==0) {
			System.out.println("Пока нет сказок в коллекции");
		}
		
	}

}
