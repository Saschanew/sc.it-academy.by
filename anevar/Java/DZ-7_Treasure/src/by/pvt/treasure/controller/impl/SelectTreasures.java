package by.pvt.treasure.controller.impl;

import by.pvt.treasure.controller.Command;
import by.pvt.treasure.controller.TO;
import by.pvt.treasure.service.ServiceFactory;
import by.pvt.treasure.service.TreasureService;

public class SelectTreasures implements Command {
	
	ServiceFactory factory = ServiceFactory.getInstance();
	TreasureService serviceImpl = factory.getTreasureServiceImpl();
	
	@Override
	public void execute(TO to) {

		serviceImpl.selectTreasures(to.getValueOfTreasureSet());
		
	}

}
