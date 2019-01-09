package by.pvt.avto.bean;

public class Disk {
	
	private String name = "Deutz";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Disk [name=" + name + "]";
	}

}
