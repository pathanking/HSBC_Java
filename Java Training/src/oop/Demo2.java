package oop;

public class Demo2 {
	public static void main(String[] args) {
		int[] ints = { 5, 2, 3, 4, 7 };
		System.out.println("Before Calling process method");
		for (int i : ints)
			System.out.println(i);
		
		process(ints);  //pass by reference
		System.out.println("After Calling process method");
		for (int i : ints)
			System.out.println(i);
	}
	
	public static void process(int[] integers) {
		integers[0] = 51;
		integers[1] = 21;
		integers[2] = 31;
		integers[3] = 41;
		integers[4] = 71;
	}
}