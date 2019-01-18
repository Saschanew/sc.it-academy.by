package by.pvt.story.view.output;

import by.pvt.story.domain.Story;
import by.pvt.story.domain.TOResponse;

public class OutputListStoriesSelect implements ViewOutputCommand {

	@Override
	public void output(TOResponse response) {
		
		System.out.println("Сказки:");
		for (Story story : response.stories) {
			System.out.println(story.toString());
		}
		
	}

}
