package oop;

public class Demo {

	public static void main(String[] args) {
		int a = 5;
		foo(a);
		System.out.println("Inside main: " + a); // 5

		Restaurant res = new Restaurant();
		res.setRestaurantId(201);
		res.setName("Abc Restaurant");
		res.setRating(3);

		System.out.println("Before Calling bar method: "+res);
		bar(res);		//pass by reference
		System.out.println("After Calling bar method: "+res);

	}

	static void foo(int x) {
		x = x + 2;
		System.out.println("Inside foo: " + x); // 7
	}

	static void bar(Restaurant restaurant) {
		restaurant.setName("Taj");
		restaurant.setRating(5);
		System.out.println("Inside bar: "+restaurant);
	}
}
