package oop.abstraction.smartwatch;

import java.util.Scanner;

public class TestSmartWatches {
	static void menu() {
		System.out.println("1. Boult");
		System.out.println("2. Noise");
	}

	public static void main(String[] args) {
		menu();
		int choice = 0;
		do {
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				Boult boult = new Boult("Boult", "Infinity Model", 1999);
				System.out.println(boult);
				boult.showTime();
				break;

			case 2:
				Noise noise = new Noise("Noise", "Zenx", 2999);
				System.out.println(noise);
				noise.showTime();
				noise.showHealthStatus();
				break;
			default:
				System.out.println("Invalid Option! Exiting");
				break;
			}
		} while (choice != 1 && choice != 2);

	}

}
