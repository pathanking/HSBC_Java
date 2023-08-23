package oop.abstraction.smartwatch;

import java.time.LocalDateTime;

public class Boult extends SmartWatch {

	int price;

	public Boult(String brand, String model, int price) {
		super(brand, model);
		this.price = price;
	}

	@Override
	void showTime() {
		System.out.println("Showing Date & Time from BOULT : " + LocalDateTime.now());
	}

	@Override
	void showHealthStatus() {
		System.out.println("Showing Health Status from BOULT : " + " \"ALL GOOD\" ");
	}

	@Override
	public String toString() {
		return "Boult [price=" + price + ", brand=" + brand + ", model=" + model + "]";
	}
}