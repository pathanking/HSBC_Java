package basics;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// get the sum of natural numbers till 10

		int sum = 0;
		int k = 1;
		while (k <= 10) {
			sum = sum + k;
			k++;
		}

		System.out.println("Sum : " + sum);
	}
}