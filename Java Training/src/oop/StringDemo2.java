package oop;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "HELLOWORLD";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.isBlank());
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('L'));
		System.out.println(str.substring(5));

		String s1 = "abc";
		String s2 = "bbc";

		System.out.println(s1.compareTo(s2)); // 0

		String s3 = s1+s2;
		System.out.println(s3); 	
		System.out.println(s1);
		System.out.println(s2);
	}
}
