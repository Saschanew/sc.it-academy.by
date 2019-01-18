package by.pvt.story.view.input;

import by.pvt.story.domain.TORequest;

public class InputFindNumberToken implements ViewInputCommand {

	@Override
	public TORequest input() {

		TORequest request = new TORequest();
		
		System.out.println("Введите максимальный набор печатных знаков:");
		request.numbTokenSelect=Helper.readInt(); 

		return request;
	}

}
