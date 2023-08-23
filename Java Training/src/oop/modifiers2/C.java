package oop.modifiers2;

import oop.modifiers.A;

public class C extends A{
	public static void main(String[] args) {
		C cObj = new C();
		//System.out.println("i : " + aObj.i);
		System.out.println("j : " + cObj.j);
		System.out.println("k : " + cObj.k);
		//System.out.println("m : " + aObj.m);
	}
}

//protected modifier:
//1. extend from the existing class
//2. instantiate child object
//3. access superclass protected field using childobject
