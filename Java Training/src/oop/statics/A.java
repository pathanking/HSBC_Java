package oop.statics;

public class A {
	final int X = 11;
	
	static int count = 0;

	A() {
		count++;
	}

	static void print() {
		System.out.println("print from A");
	}

	void foo() {
		System.out.println("foo from A");
	}

	public static void main(String[] args) {
		A a = new A();
		A a3 = new A();
		A a2 = new A();
		A a4 = new A();

		System.out.println("A Objects : " + count);
	}
}
