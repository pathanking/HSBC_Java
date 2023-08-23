package exceptions;

import java.util.Scanner;

public class ExceptioDemo7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age >>>");
		int age = scanner.nextInt();

		try {
			process(age);
		} catch (MyException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

	public static void process(int age) throws MyException {
		if (age < 18)
			throw new MyException("Not Allowed Bcz of Less Age");
		else
			System.out.println("Welcome!!");
	}
}