package by.pvt.klass.start.Taskk_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirplaneScedule {
	
	List <Airplane> list = new ArrayList<Airplane>();
	
	public List<Airplane> getList() {
		return list;
	}

	public void setList(List<Airplane> list) {
		this.list = list;
	}



	public void printByDestination(String destination) {
		
		for (Airplane airline : list) {
			if (airline.getDestination().equals(destination)) {
				System.out.println(airline.toString());
			}
		}		
		
	}

public void printByDay(String day) {
		
		for (Airplane airline : list) {
			if ((String.valueOf(airline.getDay())).equals(day)) {
				System.out.println(airline.toString());
			}
		}		
		
	}

@SuppressWarnings("deprecation")
public void printByTimePlus(int hour, int minut) {
	Date newDate = new Date();
	newDate.setHours(hour);
	newDate.setMinutes(minut);
	
	for (Airplane airline : list) {
		if (airline.getTime().compareTo(newDate)>0) {
			System.out.println(airline.toString());
		}
	}		
	
}
}
