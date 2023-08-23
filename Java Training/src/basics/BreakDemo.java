package basics;

public class BreakDemo {
	// for loop, while loop, do while loop, foreach loop, switch-case

	public static void main(String[] args) {

		int[] ints = { 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : ints) {
			if (i == 5)
				break;
			System.out.println(i);
		}

		System.out.println("skip odd numbers");
		for (int i : ints) {
			if (i % 2 == 1)
				continue;
			System.out.println(i);
		}

		foo();
	}

	public static void foo() {
		bar();
		System.out.println("inside foo() ");
	}

	public static void bar() {
		System.out.println("inside bar()");
		return;
	}
}
