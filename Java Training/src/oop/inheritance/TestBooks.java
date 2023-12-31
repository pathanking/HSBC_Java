package oop.inheritance;

public class TestBooks {

	public static void main(String[] args) {
		
		Book book = new ScienceBook(112, "Physics", "fiction");
		book.read();
		System.out.println(book);
		
		Book book2 = new ComputerBook(115, "Learn Java", "non-fiction", "java");
		System.out.println(book2);
		Book book3 = new ComputerBook(116, "Master Python", "non-fiction", "python");
		System.out.println(book3);
	}
}
