package by.pvt.state.model;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String name; private String capital; List<Department> departments = new ArrayList<>();
	private double place;
	
	public State(String name, String capital, List<Department> departments, double place) {
		this.name = name;
		this.capital = capital;
		this.departments = departments;
		this.place = place;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public double getPlace() {
		return place;
	}
	public void setPlace(double place) {
		this.place = place;
	}

	public void showCapital (){
		System.out.println("Столица: "+capital);
	}
	
	public void showNumberDepartments (){
		System.out.println("Количество областей: "+departments.size());
	}
	
	public void showPlace (){
		System.out.println("Площадь: "+place);
	}
	
	public void showDepartmentCenters(){
		System.out.println("Областные центры: ");
		for (Department department : departments) {
			System.out.printf("\t %s \n", department.getDepartmentCenter());
		}
		
	}
	
	

}
