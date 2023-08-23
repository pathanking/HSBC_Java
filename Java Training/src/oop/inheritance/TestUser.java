package oop.inheritance;

public class TestUser {
	public static void main(String[] args) {
		User user = new User(101, "Rahul");
		System.out.println(user);

		Admin admin = new Admin(505, "Siva", true, "88776655");

		System.out.println(admin);
	}
}
