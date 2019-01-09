package by.pvt.state.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name; private String departmentCenter; List<District> districts = new ArrayList<>();


	public Department(String name, String departmentCenter, List<District> districts) {
		this.name = name;
		this.departmentCenter = departmentCenter;
		this.districts = districts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentCenter() {
		return departmentCenter;
	}
	public void setDepartmentCenter(String departmentCenter) {
		this.departmentCenter = departmentCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	
	

}
