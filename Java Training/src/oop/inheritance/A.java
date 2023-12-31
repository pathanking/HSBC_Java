package oop.inheritance;

public class A {
	int i;

	A() {
	}

	A(int i) {
		this.i = i;
	}

	void foo(char c) {
		System.out.println("foo() from A," + c);
	}
}

class B extends A {
	B() {
		super();
	}

	B(int i) {
		super(i);
	}

	void foo(char c) {
		System.out.println("foo() from B, " + c);
	}
}

class TestInheritance {
	public static void main(String[] args) {
		B b = new B();
		b.foo('x');
	}
}