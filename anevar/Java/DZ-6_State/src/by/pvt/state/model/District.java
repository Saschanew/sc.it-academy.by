package by.pvt.state.model;

import java.util.ArrayList;
import java.util.List;

public class District {
	
	private String name; private List<City> citys = new ArrayList<>();


	public District(String name, List<City> citys) {		
		this.name = name;
		this.citys = citys;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public List<City> getCitys() {
		return citys;
	}
	public void setCitys(List<City> citys) {
		this.citys = citys;
	}
		

}
