package exceptions;

import java.util.Scanner;

public class ExceptionDemo8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter Your Name >>>");
			String uname = sc.next();
			process(uname);
		}
	}

	public static void process(String string) {
		if (string.length() < 5)
			throw new AbcException("Name Size Must be 5!");
		else
			System.out.println("Name : " + string);
	}
}
