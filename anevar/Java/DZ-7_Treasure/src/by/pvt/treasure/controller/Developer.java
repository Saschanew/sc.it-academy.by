package by.pvt.treasure.controller;

public class Developer {
	
	Command add;
	Command showAll;
	Command highestValue;
	Command select;
	
	
	public Developer(Command add, Command showAll, Command highestValue, Command select) {
		this.add = add;
		this.showAll = showAll;
		this.highestValue = highestValue;
		this.select = select;
	}

	public void addTreasure (){
		
		add.execute();
	}
	
	public void showAllTreasure (){
		showAll.execute();
	}
	
	public void highestValueTreasure (){
		highestValue.execute();
	}
	
	public void selectTreasure (){
		select.execute();
	}

}
