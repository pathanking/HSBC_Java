package oop.abstraction.smartphone;

import java.util.Scanner;

public class TestSmartPhones {
	static void menu() {
		System.out.println("1. OnePlus");
		System.out.println("2. Vivo");
	}

	public static void main(String[] args) {
		menu();
		int choice = 0;
		do {
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				OnePlus onePlus = new OnePlus("OnePlus", "Nord5", 8, 128);
				System.out.println(onePlus);
				onePlus.makeCall();
				onePlus.enable5G();
				break;

			case 2:
				Vivo vivo = new Vivo("Vivo", "Zen5", 12, 20);
				System.out.println(vivo);
				vivo.makeCall();
				break;
			default:
				System.out.println("Invalid Option! Exiting");
				break;
			}
		} while (choice != 1 && choice != 2);

	}

}
