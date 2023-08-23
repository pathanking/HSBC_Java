package oop.abstraction.smartphone;

public abstract class SmartPhone{
	String company;
	String model;

	SmartPhone(String company, String model) {
		this.company = company;
		this.model = model;
	}

	abstract void makeCall();

	abstract void sendText();
}