package oop.abstraction.smartphone;

public class Vivo extends SmartPhone {

	int ram;
	int fcam;

	Vivo(String company, String model, int ram, int fcam) {
		super(company, model);
		this.ram = ram;
		this.fcam = fcam;
	}

	@Override
	void makeCall() {
		System.out.println("making a call using Vivo");
	}

	@Override
	void sendText() {
		System.out.println("sending a text using Vivo");
	}

	@Override
	public String toString() {
		return "Vivo [ram=" + ram + ", fcam=" + fcam + ", company=" + company + ", model=" + model + "]";
	}
	
	
}