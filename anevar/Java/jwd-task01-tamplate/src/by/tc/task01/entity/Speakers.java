package by.tc.task01.entity;

public class Speakers extends Appliance{

	private double powerConsumption; private double numberOfSpeakers; 
	private String frequencyRange; private double cordLenght;

	public Speakers(double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLenght) {
		super();
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLenght = cordLenght;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLenght=" + cordLenght + "]";
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(double numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public double getCordLenght() {
		return cordLenght;
	}

	public void setCordLenght(double cordLenght) {
		this.cordLenght = cordLenght;
	}
	
	
		
}
