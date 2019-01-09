package by.pvt.treasure.controller;


public class SelectTreasures implements Command {
	
	Controller controller;
	int value;
	
	public SelectTreasures(Controller controller, int value) {
		this.controller = controller;
		this.value = value;
	}

	@Override
	public void execute() {
		
		controller.selectTreasures(value);
		
	}

}
