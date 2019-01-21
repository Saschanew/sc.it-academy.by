package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		Appliance appliance = new Appliance();
		
		try {
			ArrayList<String> lineList=readFile("appliances_db.txt", "UTF-8");
			
			ArrayList<Oven> listOven = new ArrayList<>();
			ArrayList<Laptop> listLaptop = new ArrayList<>();
			ArrayList<Refrigerator> listRefrigerator = new ArrayList<>();
			ArrayList<VacuumCleaner> listCleaner = new ArrayList<>();
			ArrayList<TabletPC> listPC = new ArrayList<>();
			ArrayList<Speakers> listSpeakers = new ArrayList<>();
			
			for (String string : lineList) {
				String[] words = string.split("\\s");
				
				if (words[0].equals("Oven")){
					Oven oven = new Oven(Double.valueOf(words[2].split("=")[1].split(",")[0]), Double.valueOf(words[3].split("=")[1].split(",")[0]), 
							Double.valueOf(words[4].split("=")[1].split(",")[0]), Double.valueOf(words[5].split("=")[1].split(",")[0]), 
							Double.valueOf(words[6].split("=")[1].split(",")[0]), Double.valueOf(words[7].split("=")[1].split(";")[0]));
					listOven.add(oven);					
				}
				
				if (words[0].equals("Laptop")){
					Laptop laptop = new Laptop(Double.valueOf(words[2].split("=")[1].split(",")[0]), words[3].split("=")[1].split(",")[0], 
							Double.valueOf(words[4].split("=")[1].split(",")[0]), Double.valueOf(words[5].split("=")[1].split(",")[0]), 
							Double.valueOf(words[6].split("=")[1].split(",")[0]), Double.valueOf(words[7].split("=")[1].split(";")[0]));
					listLaptop.add(laptop);
				}
				
				if (words[0].equals("Refrigerator")){
					Refrigerator refrigerator = new Refrigerator(Double.valueOf(words[2].split("=")[1].split(",")[0]), Double.valueOf(words[3].split("=")[1].split(",")[0]), 
							Double.valueOf(words[4].split("=")[1].split(",")[0]), Double.valueOf(words[5].split("=")[1].split(",")[0]), 
							Double.valueOf(words[6].split("=")[1].split(",")[0]), Double.valueOf(words[7].split("=")[1].split(";")[0]));
					listRefrigerator.add(refrigerator);
				}
				
				if (words[0].equals("VacuumCleaner")){
					VacuumCleaner cleaner = new VacuumCleaner(Double.valueOf(words[2].split("=")[1].split(",")[0]), words[3].split("=")[1].split(",")[0], 
							words[4].split("=")[1].split(",")[0], words[5].split("=")[1].split(",")[0], Double.valueOf(words[6].split("=")[1].split(",")[0]), 
							Double.valueOf(words[7].split("=")[1].split(";")[0])); 
					listCleaner.add(cleaner);
				}
				
				if (words[0].equals("TabletPC")){
					TabletPC pc = new TabletPC(Double.valueOf(words[2].split("=")[1].split(",")[0]), Double.valueOf(words[3].split("=")[1].split(",")[0]), 
					Double.valueOf(words[4].split("=")[1].split(",")[0]), Double.valueOf(words[5].split("=")[1].split(",")[0]), words[6].split("=")[1].split(";")[0]);
					listPC.add(pc);
				}
				
				if (words[0].equals("Speakers")){
					Speakers speakers = new Speakers(Double.valueOf(words[2].split("=")[1].split(",")[0]), Double.valueOf(words[3].split("=")[1].split(",")[0]), 
					words[4].split("=")[1].split(",")[0], Double.valueOf(words[5].split("=")[1].split(";")[0]));
					listSpeakers.add(speakers);
				}
			}
		
		//Oven
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.Oven.class) {
			int dbl;
			boolean correct=true;
			
			for (Oven oven : listOven) {
				for (E e : criteria.getCriteria().keySet()) {
				
				if (e == SearchCriteria.Oven.CAPACITY){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.CAPACITY);					
						if (oven.getCapacity() == (double) dbl) {
							correct = true;	
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Oven.HEIGHT){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.HEIGHT);
						if (oven.getHeight() == (double) dbl) {
							correct = true;						
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Oven.DEPTH){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.DEPTH);
						if (oven.getDepth() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Oven.POWER_CONSUMPTION){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.POWER_CONSUMPTION);
						if (oven.getPowerConsumption() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Oven.WEIGHT){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.WEIGHT);
						if (oven.getWeight() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Oven.WIDTH){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Oven.WIDTH);
						if (oven.getWidth() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=oven;
				}				
					
			}
			
		}
		
		//Laptop
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.Laptop.class) {
			double dbl;
			String dblS;
			boolean correct=true;
			
			for (Laptop laptop : listLaptop) {
				for (E e : criteria.getCriteria().keySet()) {
				
				if (e == SearchCriteria.Laptop.BATTERY_CAPACITY){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.Laptop.BATTERY_CAPACITY);					
						if (laptop.getBatteryCapacity() == dbl) {
							correct = true;	
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Laptop.CPU){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.Laptop.CPU);
						if (laptop.getCpu() == dbl) {
							correct = true;						
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Laptop.DISPLAY_INCHS){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Laptop.DISPLAY_INCHS);
						if (laptop.getDisplayInchs() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Laptop.MEMORY_ROM){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.Laptop.MEMORY_ROM);
						if (laptop.getMemoryRom() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Laptop.OS){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.Laptop.OS));
						if (laptop.getOS().equals(dblS)) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Laptop.SYSTEM_MEMORY){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.Laptop.SYSTEM_MEMORY);
						if (laptop.getSystemMemory() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=laptop;
				}				
					
			}
			
		}
		
		//Refrigerator
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.Refrigerator.class) {
			int dbl;
			boolean correct=true;
			
			for (Refrigerator ref : listRefrigerator) {
				for (E e : criteria.getCriteria().keySet()) {
				
				if (e == SearchCriteria.Refrigerator.FREEZER_CAPACITY){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.FREEZER_CAPACITY);					
						if (ref.getFreezerCapacity() == (double) dbl) {
							correct = true;	
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Refrigerator.HEIGHT){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.HEIGHT);
						if (ref.getHeight() == (double) dbl) {
							correct = true;						
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Refrigerator.OVERALL_CAPACITY){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.OVERALL_CAPACITY);
						if (ref.getOveralCapacity() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Refrigerator.POWER_CONSUMPTION){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.POWER_CONSUMPTION);
						if (ref.getPowerConsumption() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Refrigerator.WEIGHT){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.WEIGHT);
						if (ref.getWeight() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Refrigerator.WIDTH){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Refrigerator.WIDTH);
						if (ref.getWidth() == (double) dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=ref;
				}				
					
			}
			
		}
		
		//VacuumCleaner
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.VacuumCleaner.class) {
			double dbl;
			String dblS;
			boolean correct=true;
			
			for (VacuumCleaner cleaner : listCleaner) {
				for (E e : criteria.getCriteria().keySet()) {
				
				if (e == SearchCriteria.VacuumCleaner.BAG_TYPE){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.BAG_TYPE));					
						if (cleaner.getBagType().equals(dblS)) {
							correct = true;	
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.VacuumCleaner.CLEANING_WIDTH){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH);
						if (cleaner.getCleaningWidth() == dbl) {
							correct = true;						
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.VacuumCleaner.FILTER_TYPE){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.FILTER_TYPE));
						if (cleaner.getFilterType().equals(dblS)) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION);
						if (cleaner.getMotorSpeedRegulation() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.VacuumCleaner.POWER_CONSUMPTION){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION);
						if (cleaner.getPowerConsumption() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.VacuumCleaner.WAND_TYPE){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.WAND_TYPE));
						if (cleaner.getWandType().equals(dblS)) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=cleaner;
				}				
					
			}
			
		}
		
		//TabletPC
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.TabletPC.class) {
			double dbl;
			String dblS;
			boolean correct=true;
			
			for (TabletPC pc : listPC) {
				for (E e : criteria.getCriteria().keySet()) {
				
				if (e == SearchCriteria.TabletPC.BATTERY_CAPACITY){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.TabletPC.BATTERY_CAPACITY);					
						if (pc.getBatteryCapacity() == dbl) {
							correct = true;	
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.TabletPC.COLOR){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.TabletPC.COLOR));
						if (pc.getColor().equals(dblS)) {
							correct = true;						
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.TabletPC.DISPLAY_INCHES){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.TabletPC.DISPLAY_INCHES);
						if (pc.getDisplayInches() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY);
						if (pc.getFlashMemoryCapacity() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.TabletPC.MEMORY_ROM){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.TabletPC.MEMORY_ROM);
						if (pc.getMemoryRom() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=pc;
				}				
					
			}
			
		}
		
		//Speakers
		if (criteria.getCriteria().keySet().toArray()[0].getClass() == SearchCriteria.Speakers.class) {
			double dbl;
			String dblS;
			boolean correct=true;
			
			for (Speakers speakers : listSpeakers) {
				for (E e : criteria.getCriteria().keySet()) {
								
				if (e == SearchCriteria.Speakers.CORD_LENGTH){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Speakers.CORD_LENGTH);
						if (speakers.getCordLenght() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Speakers.NUMBER_OF_SPEAKERS){
					dbl = (int) criteria.getCriteria().get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS);
						if (speakers.getNumberOfSpeakers() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Speakers.FREQUENCY_RANGE){
					dblS = String.valueOf(criteria.getCriteria().get(SearchCriteria.Speakers.FREQUENCY_RANGE));
						if (speakers.getFrequencyRange().equals(dblS)) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				if (e == SearchCriteria.Speakers.POWER_CONSUMPTION){
					dbl = (double) criteria.getCriteria().get(SearchCriteria.Speakers.POWER_CONSUMPTION);
						if (speakers.getPowerConsumption() == dbl) {
							correct = true;					
						}else{
							correct = false;
							break;
						}
					}
				
				}
				if (correct == true) {
					appliance=speakers;
				}				
					
			}
			
		}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return appliance;
	}
	
	static ArrayList<String> readFile(String fileName, String encoding) throws IOException{
		// Reader для построчного чтения
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileName), encoding));
		StringBuilder content = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = reader.readLine()) != null) {
			content.append(line);
			// переход на новую строку
			content.append("\n");
			list.add(line);
		}
		reader.close();
		return list;
	}

}


//you may add your own new classes