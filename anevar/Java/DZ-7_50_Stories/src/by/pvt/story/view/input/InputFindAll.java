package by.pvt.story.view.input;

import by.pvt.story.domain.TORequest;

public class InputFindAll implements ViewInputCommand{

	@Override
	public TORequest input() {
		
		TORequest request = new TORequest();
		
		return request;
	}

}
