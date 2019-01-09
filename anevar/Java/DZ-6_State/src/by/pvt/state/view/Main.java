package by.pvt.state.view;

import java.util.ArrayList;
import java.util.List;

import by.pvt.state.model.City;
import by.pvt.state.model.Department;
import by.pvt.state.model.District;
import by.pvt.state.model.State;

public class Main {

	public static void main(String[] args) {
		//  Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
		// вывести на консоль столицу, количество областей, площадь, областные центры
		
		City city1 = new City("Smolevichi"); City city2 = new City("Orscha"); City city3 = new City("Baranovichi");
		City city4 = new City("Pinsk"); City city5 = new City("Bereza"); City city6 = new City("Kobrin");
		List<City> citys = new ArrayList<>();
		List<City> citys2 = new ArrayList<>();
		citys.add(city1); citys.add(city2); citys.add(city3);
		citys2.add(city4); citys.add(city5); citys.add(city6);
		
		District district = new District("Smolevichskij", citys);
		List<District> districts = new ArrayList<>();
		districts.add(district);
		District district2 = new District("Baranovichskij", citys2);
		List<District> districts2 = new ArrayList<>();
		districts2.add(district2);
		
		Department department = new Department("Minskaja", "Minsk", districts);
		Department department2 = new Department("Brestskaja", "Brest", districts2);
		List<Department> departments = new ArrayList<>();
		departments.add(department); departments.add(department2);
		
		State state = new State("Madagaskar", "Antananarivo", departments, 660);
		
		state.showCapital();
		state.showNumberDepartments();
		state.showPlace();
		state.showDepartmentCenters();

	}

}
