package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] ints = new int[5];
		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;
		ints[3] = 5;
		ints[4] = 6;
		for (int i : ints)
			System.out.println(i);

		System.out.println("second array");
		int[] ints2 = { 2, 3, 4, 5, 7 };
		for (int k : ints2)
			System.out.println(k);

		System.out.println("third array");
		int[] ints3 = new int[] { 3, 5, 7 };
		for (int i : ints3)
			System.out.println(i);

		System.out.println("characters array");
		char[] chars = { 'a', '@', '$', '^', '3' };
		for (char c : chars)
			System.out.println(c);

	}
}