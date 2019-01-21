package by.tc.task01.entity;

public class Laptop extends Appliance{
 
	private double batteryCapacity; private String OS; private double memoryRom; 
	private double	systemMemory; private double cpu; private double displayInchs;


	public Laptop(double batteryCapacity, String oS, double memoryRom, double systemMemory, double cpu,
			double displayInchs) {
		super();
		this.batteryCapacity = batteryCapacity;
		OS = oS;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OS=" + OS + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(double systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}
	
	

}
