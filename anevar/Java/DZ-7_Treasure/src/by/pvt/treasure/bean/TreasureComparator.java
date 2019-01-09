package by.pvt.treasure.bean;

import java.util.Comparator;

public class TreasureComparator implements Comparator<Treasure> {

	@Override
	public int compare(Treasure o1, Treasure o2) {
		
		return o1.getValue()-o2.getValue();
	}

}
