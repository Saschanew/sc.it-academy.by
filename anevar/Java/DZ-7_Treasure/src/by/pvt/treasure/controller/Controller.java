package by.pvt.treasure.controller;

import by.pvt.treasure.bean.Treasure;

public class Controller {
	
	CommandProvider provider = new CommandProvider();
	
	public void executeTaskAdd(String command, String name, String value){   
		   
		Command executionCommand;  
		
		TO to = new TO();
		Treasure treasure = new Treasure(name, Integer.valueOf(value));
		to.setTreasure(treasure);		
		
		executionCommand = provider.getCommand(command);      
		
		 executionCommand.execute(to);      
	   
		}
	
	public void executeTask(String command){   
		   
		Command executionCommand;		
		TO to = new TO();			
		executionCommand = provider.getCommand(command);		
		 executionCommand.execute(to);      
	   
		}
	
	public void executeSelectTreasures(String command, String value){   
		   
		Command executionCommand;  
		
		TO to = new TO();
		to.setValueOfTreasureSet(Integer.valueOf(value));
		
		executionCommand = provider.getCommand(command);      
		
		 executionCommand.execute(to);      
	   
		}


}
