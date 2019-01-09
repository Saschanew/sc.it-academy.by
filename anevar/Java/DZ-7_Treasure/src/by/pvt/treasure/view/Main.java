package by.pvt.treasure.view;

import by.pvt.treasure.bean.Treasure;
import by.pvt.treasure.controller.AddTreasure;
import by.pvt.treasure.controller.Controller;
import by.pvt.treasure.controller.Developer;
import by.pvt.treasure.controller.HighestValueTreasure;
import by.pvt.treasure.controller.SelectTreasures;
import by.pvt.treasure.controller.ShowAllTreasure;

public class Main {

	public static void main(String[] args) {
		
		Treasure treasure1 = new Treasure("Ring", 150);
		Treasure treasure2 = new Treasure("Medal", 240);
		Treasure treasure3 = new Treasure("Carcanet", 550);
		Treasure treasure4 = new Treasure("Crown", 750);
		Treasure treasure5 = new Treasure("Gold", 650);	
		
	Controller controller = new Controller();	
		
	Developer developer1 = new Developer(new AddTreasure(controller, treasure1), new ShowAllTreasure(controller), 
			new HighestValueTreasure(controller), new SelectTreasures(controller,400));	
	Developer developer2 = new Developer(new AddTreasure(controller, treasure2), new ShowAllTreasure(controller), 
			new HighestValueTreasure(controller), new SelectTreasures(controller,400));
	Developer developer3 = new Developer(new AddTreasure(controller, treasure3), new ShowAllTreasure(controller), 
			new HighestValueTreasure(controller), new SelectTreasures(controller,400));
	Developer developer4 = new Developer(new AddTreasure(controller, treasure4), new ShowAllTreasure(controller), 
			new HighestValueTreasure(controller), new SelectTreasures(controller,400));
	Developer developer5 = new Developer(new AddTreasure(controller, treasure5), new ShowAllTreasure(controller), 
			new HighestValueTreasure(controller), new SelectTreasures(controller,400));

	
	developer1.addTreasure();
	developer2.addTreasure();
	developer3.addTreasure();
	developer4.addTreasure();
	developer5.addTreasure();
	
	developer1.showAllTreasure();
	developer1.highestValueTreasure();
	developer1.selectTreasure();
		
	}
}
