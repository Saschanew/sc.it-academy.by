package by.pvt.treasure.dao;

import java.util.ArrayList;

import DB_Simulation.ListTreasure;
import by.pvt.treasure.bean.Treasure;

public class DbTreasureDAO implements TreasureDAO {
		

	@Override
	public void addTreasure(Treasure treasure) {
		
		ListTreasure.getTreasures().getList().add(treasure);
	}

	@Override
	public ArrayList<Treasure> getAll() {
		ArrayList<Treasure> temp=(ArrayList<Treasure>)ListTreasure.getTreasures().getList();
		return temp;
	}

}
