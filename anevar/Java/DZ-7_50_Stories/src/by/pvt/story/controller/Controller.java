package by.pvt.story.controller;

import by.pvt.story.domain.TORequest;
import by.pvt.story.domain.TOResponse;
import by.pvt.story.model.Command;
import by.pvt.story.model.ModelHelper;
import by.pvt.story.view.ViewInputHelper;
import by.pvt.story.view.ViewOutputHelper;

public class Controller {

	private ModelHelper model = new ModelHelper();
	private ViewInputHelper viewInput = new ViewInputHelper();
	private ViewOutputHelper viewOutput = new ViewOutputHelper();

	// String name, String ranking, String numbToken

	public void doAсtion() {

		TORequest request = viewInput.getCommand("INPUT_MAIN_MENU").input();
		executeTask(request.commandName);

	}

	void executeTask(String commandName) {

		Command command = model.getCommand(commandName);
		// if command == null
		TORequest request = viewInput.getCommand(commandName).input();
		TOResponse response;
		response = command.execute(request);
		viewOutput.getCommand(commandName).output(response);

	}

}
