package by.pvt.treasure.controller;

import by.pvt.treasure.bean.Treasure;
import by.pvt.treasure.service.ServiceFactory;
import by.pvt.treasure.service.TreasureService;

public class Controller {
	
	ServiceFactory factory = ServiceFactory.getInstance();
	TreasureService serviceImpl = factory.getTreasureServiceImpl();
	
	void addTreasure (Treasure treasure){
		serviceImpl.addTreasure(treasure);
	}
	void showAllTreasure (){
		serviceImpl.showAllTreasure();
	}
	void highestValueTreasure (){
		serviceImpl.highestValueTreasure();
	}
	void selectTreasures (int value){
		serviceImpl.selectTreasures(value);
	}

}
