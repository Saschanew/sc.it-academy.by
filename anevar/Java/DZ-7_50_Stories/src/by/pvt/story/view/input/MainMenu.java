package by.pvt.story.view.input;

import by.pvt.story.domain.TORequest;

public class MainMenu implements ViewInputCommand {

	@Override
	public TORequest input() {
		
		TORequest request = new TORequest();
		int x=0;		
		
			System.out.println("Введите 1 для добавления сказки, 2 для просмотра всех, 3 для самой интересной"
					+ ", 4 для выбора набора по печатным знакам");
			x=Helper.readInt();
			if (x==1) {	request.commandName = "INPUT_NEW_STORY";}	
			if (x==2) {	request.commandName = "INPUT_FIND_ALL";}
			if (x==3) {	request.commandName = "FIND_BY_HIGHEST_RANKING";}
			if (x==4) {	request.commandName = "FIND_BY_NUMB_TOKEN";}

		return request;
	}

}
