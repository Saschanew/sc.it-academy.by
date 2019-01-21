package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 32);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.DEPTH, 60);	
		criteriaOven.add(Oven.POWER_CONSUMPTION, 2000);		

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		
		//////////////////////////////////////////////////////////////////
				
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		
		appliance = service.find(criteriaTabletPC);
		
		PrintApplianceInfo.print(appliance);
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
       		
        criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 1.5);
        criteriaLaptop.add(Laptop.CPU, 2.2);	
        criteriaLaptop.add(Laptop.DISPLAY_INCHS, 19);
        criteriaLaptop.add(Laptop.OS, "Linux");

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<Refrigerator> criteriaRef = new Criteria<Refrigerator>();
       		
        criteriaRef.add(Refrigerator.FREEZER_CAPACITY, 15);
        criteriaRef.add(Refrigerator.WEIGHT, 30);
        
        appliance = service.find(criteriaRef);

		PrintApplianceInfo.print(appliance);
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<VacuumCleaner> criteriaClean = new Criteria<VacuumCleaner>();

		criteriaClean.add(VacuumCleaner.CLEANING_WIDTH, 30);
		criteriaClean.add(VacuumCleaner.FILTER_TYPE, "C");

		appliance = service.find(criteriaClean);

		PrintApplianceInfo.print(appliance);
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();

		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-4");
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 2);

		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);

	}

}
