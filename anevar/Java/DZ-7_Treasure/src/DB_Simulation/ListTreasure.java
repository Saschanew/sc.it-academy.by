package DB_Simulation;

import java.util.ArrayList;
import java.util.List;

import by.pvt.treasure.bean.Treasure;

public class ListTreasure {
	
	private static final ListTreasure treasures = new ListTreasure();
	
	private final List <Treasure> list = new ArrayList<>();
	
	private ListTreasure(){
		
	}
	
	public static ListTreasure getTreasures(){   
		return treasures;  }

	public List<Treasure> getList() {
		return list;
	} 	

}
