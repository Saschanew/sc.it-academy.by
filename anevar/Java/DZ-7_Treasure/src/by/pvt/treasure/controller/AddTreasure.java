package by.pvt.treasure.controller;

import by.pvt.treasure.bean.Treasure;

public class AddTreasure implements Command {
	
	Controller controller;
	Treasure treasure;
			
	public AddTreasure(Controller controller, Treasure treasure) {
		this.controller = controller;
		this.treasure = treasure;
	}



	@Override
	public void execute() {
		
		controller.addTreasure(treasure);
		
	}



}
