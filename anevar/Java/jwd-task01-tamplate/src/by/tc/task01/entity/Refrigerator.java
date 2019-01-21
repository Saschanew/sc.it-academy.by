package by.tc.task01.entity;

public class Refrigerator extends Appliance{

	private double powerConsumption; private double weight; private double freezerCapacity; 
	private double overalCapacity; private double height; private double width;


	public Refrigerator(double powerConsumption, double weight, double freezerCapacity, double overalCapacity,
			double height, double width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overalCapacity = overalCapacity;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overalCapacity=" + overalCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOveralCapacity() {
		return overalCapacity;
	}

	public void setOveralCapacity(double overalCapacity) {
		this.overalCapacity = overalCapacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
}
