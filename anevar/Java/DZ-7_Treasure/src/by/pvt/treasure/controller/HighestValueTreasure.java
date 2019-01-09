package by.pvt.treasure.controller;

public class HighestValueTreasure implements Command {
	
	Controller controller;
	
	public HighestValueTreasure(Controller controller) {
		
		this.controller = controller;
	}

	@Override
	public void execute() {
		controller.highestValueTreasure();
		
	}

}
