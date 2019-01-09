package by.pvt.avto.bean;

public class Motor {
	
	private String name = "MMZ";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Motor [name=" + name + "]";
	}
	
	
}
