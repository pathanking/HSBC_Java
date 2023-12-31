package oop.abstraction.smartwatch;

public abstract class SmartWatch {

	String brand;
	String model;
	
	SmartWatch(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	
	abstract void showTime();
	abstract void showHealthStatus();
}