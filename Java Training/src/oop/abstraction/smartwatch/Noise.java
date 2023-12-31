package oop.abstraction.smartwatch;

import java.time.LocalDateTime;

import oop.abstraction.contracts.FiveGEnabler;

public class Noise extends SmartWatch implements FiveGEnabler{
	int price;

	public Noise(String brand, String model, int price) {
		super(brand, model);
		this.price = price;
	}

	@Override
	void showTime() {
		System.out.println("Showing Date & Time from Noise : " + LocalDateTime.now());
	}

	@Override
	void showHealthStatus() {
		System.out.println("Showing Health Status from Noise : " + " \"ALL GOOD\" ");
	}

	@Override
	public String toString() {
		return "Noise [price=" + price + ", brand=" + brand + ", model=" + model + "]";
	}

	@Override
	public void enable5G() {
		System.out.println("Noise SmartWatches are Now Powered with 5G!!");
	}
}
