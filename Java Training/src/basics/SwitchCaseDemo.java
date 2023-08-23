package basics;

import java.util.Scanner;

/**
 * 
 * @author razaa
 * @apiNote menu base applications switch-case is preferred
 */

public class SwitchCaseDemo {
	public static void menu() {
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Division");
		System.out.println("[5] Remainder");
	}

	public static void main(String[] args) {
		menu();	//calling menu method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number for arithmetic operation");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("Enter Your Choice : [1 | 2 | 3 | 4 | 5]");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Addition : " + (n1 + n2));
			break;
		case 2:
			System.out.println("Subtraction : " + (n1 - n2));
			break;
		case 3:
			System.out.println("Multipliction : " + (n1 * n2));
			break;
		case 4:
			System.out.println("Division : " + (n1 / n2));
			break;
		case 5:
			System.out.println("Remainder : " + (n1 % n2));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
