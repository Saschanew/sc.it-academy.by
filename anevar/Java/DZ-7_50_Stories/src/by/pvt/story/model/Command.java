package by.pvt.story.model;

import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;

public interface Command {
	
	public TOResponse execute(TORequest to);

}
