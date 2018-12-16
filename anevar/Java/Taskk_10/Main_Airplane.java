package by.pvt.klass.start.Taskk_10;

public class Main_Airplane {

	public static void main(String[] args) {
		// Найти и вывести:  a) список рейсов для заданного пункта назначения;  
		// b) список рейсов для заданного дня недели;  c) список рейсов для заданного дня недели, 
		// время вылета для которых больше заданного. 

		Airplane plane = new Airplane("Vorkuta", 123, "Tu-134", 
				10, 15, Airplane_WeekDays.TUESDAY);
		Airplane plane1 = new Airplane("Vorkuta", 123, "Tu-134", 
				17, 15, Airplane_WeekDays.WEDNESDAY);
		Airplane plane2 = new Airplane("Magadan", 123, "Tu-134", 
				19, 45, Airplane_WeekDays.MONDAY);
				
		AirplaneScedule scedule = new AirplaneScedule();
						
		scedule.getList().add(plane);
		scedule.getList().add(plane1);
		scedule.getList().add(plane2);
		
		System.out.println("список рейсов для заданного пункта назначения:");
		scedule.printByDestination("Vorkuta");
		
		System.out.println("список рейсов для заданного дня недели:");
		scedule.printByDay("MONDAY");
		
		System.out.println("список время вылета для которых больше заданного:");
		scedule.printByTimePlus(11, 15);
		
	}

}
