package by.pvt.story.view.output;

import by.pvt.story.domain.TOResponse;

public class OutputStory implements ViewOutputCommand {

	@Override
	public void output(TOResponse response) {
		System.out.println("Наша сказка:");
		System.out.println(response.story.toString());
		
	}

}
