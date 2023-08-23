package oop;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hello");
		builder.append("world");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.charAt(2));
		System.out.println(builder.deleteCharAt(0));
	}
}