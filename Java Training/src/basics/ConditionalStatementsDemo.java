package basics;

import java.util.Scanner;

public class ConditionalStatementsDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		do {
			System.out.println("Enter Your PIN");
			int pin = scanner.nextInt();
			if (pin == 1234) {
				System.out.println("Success");
				break;
			} else {
				count++;
				System.out.println(count + " Wrong Attempt");

				if (count == 3) {
					System.out.println("User Blocked!!");
					break;
				}
			}
		} while (count <= 3);
	}
}