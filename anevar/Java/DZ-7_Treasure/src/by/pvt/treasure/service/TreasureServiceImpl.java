package by.pvt.treasure.service;

import java.util.ArrayList;

import by.pvt.treasure.bean.Treasure;
import by.pvt.treasure.bean.TreasureComparator;
import by.pvt.treasure.dao.DAOFactory;
import by.pvt.treasure.dao.TreasureDAO;

public class TreasureServiceImpl implements TreasureService {
	
	//Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
	// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
	// выбора сокровищ на заданную сумму.

	DAOFactory factory = DAOFactory.getInstance();
	TreasureDAO treasureDAO = factory.getDbTreasureImpl();
	
	@Override
	public void addTreasure(Treasure treasure) {
		
		treasureDAO.addTreasure(treasure);
		
	}

	@Override
	public void showAllTreasure() {
		
		ArrayList<Treasure> temp = treasureDAO.getAll();
		System.out.println("Все сокровища: ");
		for (Treasure treasure : temp) {			
			System.out.println(treasure.toString());
		}
	}

	@Override
	public void highestValueTreasure() {
		
		ArrayList<Treasure> temp = treasureDAO.getAll();
		
		TreasureComparator comparator = new TreasureComparator();
		temp.sort(comparator);
				
		Treasure highestTreasure = temp.get(temp.size()-1);
		
		System.out.println("Самое ценное сокровище: "+highestTreasure.toString());;
	}

	@Override
	public void selectTreasures(int value) {
		
		ArrayList<Treasure> temp = treasureDAO.getAll();
		
        TreasureComparator comparator = new TreasureComparator();
		temp.sort(comparator);
		
		ArrayList<Treasure> tempSum = new ArrayList<>();
		int sum = 0;		
		for (int i = 0; i < temp.size(); i++) {
			if (sum+temp.get(i).getValue()<value) {			
				tempSum.add(temp.get(i));
				sum+=temp.get(i).getValue();
			}
			
		}
		
		System.out.println("Сокровища на сумму "+value+": "+tempSum.toString());
	}



}
