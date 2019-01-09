package by.pvt.treasure.controller;

public class ShowAllTreasure implements Command {
	
	Controller controller;
		

	public ShowAllTreasure(Controller controller) {
		
		this.controller = controller;
	}


	@Override
	public void execute() {
		controller.showAllTreasure();
		
	}

}
