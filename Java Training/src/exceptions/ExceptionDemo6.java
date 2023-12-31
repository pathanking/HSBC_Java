package exceptions;

class A {
	void m() {
		System.out.println("m from A");
	}
}

class B extends A {
	void m() {
		System.out.println("m from B");
	}
}

public class ExceptionDemo6 {
	public static void main(String[] args) {
		B b = new B();
		print(b);

		Integer i1 = new Integer(101);
		process(i1);
	}

	public static void print(A a) {
		a.m();
	}

	public static void process(Object o) {
		Integer i2 = (Integer) o;
		System.out.println("integer : " + o.toString());
	}
}
