package oop;

public class StringDemo {

	public static void main(String[] args) {
		String str = "12";
		String str2 = "true";
		String str3 = "hello \n" + "this \n" + "is \n" + "raza!";
		String str4 = new String("hi");
		String str5 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}