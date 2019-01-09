package by.pvt.treasure.bean;

public class Treasure {
	
	private String name; private int value;
	
	public Treasure(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Treasure (){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Treasure [name= " + name + ", value= " + value + "]";
	}
	

}
