package oop.abstraction.smartphone;

import oop.abstraction.contracts.FiveGEnabler;

public class OnePlus extends SmartPhone implements FiveGEnabler{
	int ram;
	int rom;
	
	OnePlus(String company, String model, int ram, int rom) {
		super(company, model);
		this.ram = ram;
		this.rom = rom;
	}

	@Override
	void makeCall() {
		System.out.println("making a call using OnePlus");
	}

	@Override
	void sendText() {
		System.out.println("sending a text using OnePlus");
	}

	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", rom=" + rom + ", company=" + company + ", model=" + model + "]";
	}

	@Override
	public void enable5G() {
		System.out.println("OnePlus SmartPhones are 5G powered!!");
	}
}
