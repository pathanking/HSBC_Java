package oop;

public class Demo3 {
	public static void main(String[] args) {
		Integer i1 = new Integer(101);

		Integer i2 = new Integer(202);

		System.out.println(i1);// 101
		System.out.println(i2);// 202

		System.out.println("i1 hashcode: " + i1.hashCode());
		System.out.println("i2 hahscode: " + i2.hashCode());
		
		
		String str = "hello";
		System.out.println("str hashcode : "+str.hashCode());
	}
}
