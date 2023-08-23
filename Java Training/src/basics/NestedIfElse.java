package basics;

import java.util.Scanner;

/**
 * 
 * @author razaa
 * @apiNote find max of three numbers using nested if-else
 */

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers >>>");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b) {
			if (a > c)
				System.out.printf("%d is max", a);
			else
				System.out.printf("%d is max", c);

		} else if (c > b) {

			if (c > a)
				System.out.printf("%d is max", c);
			else
				System.out.printf("%d is max", a);
		}
	}
}