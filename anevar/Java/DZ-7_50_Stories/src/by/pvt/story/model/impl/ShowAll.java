package by.pvt.story.model.impl;

import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;
import by.pvt.story.model.Command;

public class ShowAll implements Command {

	@Override
	public TOResponse execute(TORequest to) {
		
        TOResponse response = new TOResponse();
        
		return response;
	}

}
