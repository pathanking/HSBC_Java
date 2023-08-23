package oop.modifiers;

public class A {

	private int i = 2;
	protected int j = 3;
	public int k = 4;
	int m = 5;

	public static void main(String[] args) {
		A aObj = new A();
		System.out.println("i : " + aObj.i);
		System.out.println("j : " + aObj.j);
		System.out.println("k : " + aObj.k);
		System.out.println("m : " + aObj.m);
	}
}