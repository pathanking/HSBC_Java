package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers >>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		System.out.println("Div : " + (n1 / n2));
	}
}