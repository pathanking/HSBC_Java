package mcqs;

/**
 * 
 * @author razaa
 *
 * access modifiers least ristricted to most 
 * 
 * public, protected, package(default), private
 * 
 * 
 */

interface TestInterface{
	void x();
}

abstract class A{
	abstract void m();
}

abstract class B extends A{
}

abstract class C implements TestInterface{
	
}




class First{
	void m1() {
		System.out.println("m1 of First");
	}
}
class Second extends First{
	void m1() {
		System.out.println("m1 of Second");
	}
}

public class Demo {
	public static void main(String[] args) {
		First first = new Second();
		first.m1();
	}
}
