package by.tc.task01.entity;

public class Appliance {
	
	private String defaultName = "По Вашим критериям ничего не найдено";

	public Appliance(String defaultName) {
		super();
		this.defaultName = defaultName;
	}

	public Appliance() {
	
	}

	@Override
	public String toString() {
		return defaultName;
	}
	
	
	
	// you may add your own code here
}
