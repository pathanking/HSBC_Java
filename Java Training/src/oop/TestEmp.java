package oop;

public class TestEmp {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "sai");
		Emp e2 = new Emp(1, "sai");
		
		boolean result = e1.equals(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(result);
	}
}
