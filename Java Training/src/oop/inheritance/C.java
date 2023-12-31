package oop.inheritance;

public class C {
	void show() {
		System.out.println("show from C");
	}
}

class D extends C {
	void show() {
		System.out.println("show from D...!");
	}
	
	void print() {
		System.out.println("print from D");
	}
}

class TestInheritance2 {
	public static void main(String[] args) {
		D dObject = new D();
		dObject.show(); // show from D
		dObject.print(); //
	}
}