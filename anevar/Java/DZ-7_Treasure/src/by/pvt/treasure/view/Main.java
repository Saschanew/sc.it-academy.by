package by.pvt.treasure.view;

import by.pvt.treasure.controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		// Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
		// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
		// выбора сокровищ на заданную сумму. 
		
		Controller controller = new Controller();
		
		controller.executeTaskAdd("add_treasure", "Ring", "150");
		controller.executeTaskAdd("add_treasure", "Medal", "240");
		controller.executeTaskAdd("add_treasure", "Carcanet", "550");
		controller.executeTaskAdd("add_treasure", "Crown", "750");
		controller.executeTaskAdd("add_treasure", "Gold", "650");
		
		controller.executeTask("show_all_treasure");
		controller.executeTask("show_highest_value_treasure");
		
		controller.executeSelectTreasures("select_treasures", "400");	
		
	}
}
