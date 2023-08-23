package oop;

public class TestRestaurant {
	public static void main(String[] args) {

		Restaurant r1 = new Restaurant();

		r1.setRestaurantId(1101);
		r1.setName("Paradise");
		r1.setRating(5);

		System.out.println(r1);

		Restaurant r2 = new Restaurant();
		r2.setRestaurantId(1102);
		r2.setName("Ritz");
		r2.setRating(10);

		System.out.println(r2);

	}
}
