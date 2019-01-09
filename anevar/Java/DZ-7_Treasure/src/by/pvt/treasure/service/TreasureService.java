package by.pvt.treasure.service;

import by.pvt.treasure.bean.Treasure;

public interface TreasureService {
	
	//Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
	// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
	// выбора сокровищ на заданную сумму. 
	
	void addTreasure (Treasure treasure);
	void showAllTreasure ();
	void highestValueTreasure ();
	void selectTreasures (int value);
}
