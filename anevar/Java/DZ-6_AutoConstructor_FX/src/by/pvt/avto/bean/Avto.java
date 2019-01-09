package by.pvt.avto.bean;

import java.util.ArrayList;
import java.util.List;

public class Avto {
			
	private Motor motor; private List<Disk> disks = new ArrayList<>(4); private boolean loaded = false;
    private String brand; 
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public List<Disk> getDisks() {
		return disks;
	}
	public void setDisks(ArrayList<Disk> disks) {
		this.disks = disks;
	}

	public boolean isLoaded() {
		return loaded;
	}
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
		
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}	

	@Override
	public String toString() {
		return "Avto [motor=" + motor + ", disks=" + disks + ", loaded=" + loaded + ", brand=" + brand + "]";
	}
	public boolean canDrive(){
		boolean canDrive=false;
		if (disks.size() >= 4 && loaded == true && motor != null) {
			canDrive=true;
		}
		return canDrive;
	}

}
