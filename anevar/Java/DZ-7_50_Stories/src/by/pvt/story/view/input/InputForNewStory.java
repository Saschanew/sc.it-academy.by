package by.pvt.story.view.input;

import by.pvt.story.domain.TORequest;

public class InputForNewStory implements ViewInputCommand{

	@Override
	public TORequest input() {
		
		TORequest request = new TORequest();
		
		System.out.println("Введите имя сказки");	
		request.storyName=Helper.readString(); 
		System.out.println("Введите популярность");
		request.ranking=Helper.readInt();
		System.out.println("Введите число печатных знаков");
		request.numbToken=Helper.readInt(); 	
		
		return request;
	}

}
