package by.pvt.treasure.dao;

import java.util.ArrayList;

import by.pvt.treasure.bean.Treasure;

public interface TreasureDAO {
	
	void addTreasure (Treasure treasure);
	
	ArrayList<Treasure> getAll ();

}
