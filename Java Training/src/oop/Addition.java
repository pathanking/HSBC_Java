package oop;

public class Addition {
	public void add(int x, int y) {
		System.out.println("(int x, int y): " + (x + y));
	}

	public void add(short x, short y) {
		System.out.println("(short x, short y): " + (x + y));
	}

	public void add(byte x, byte y) {
		System.out.println("(byte x, byte y): " + (x + y));
	}

	public void add(long x, long y) {
		System.out.println("(long x, long y): " + (x + y));
	}

	public void add(double d, double e) {
		System.out.println("(double d, double e): " + (d + e));
	}

	public void add(float d, float e) {
		System.out.println("(float d, float e): " + (d + e));
	}

	public void add(int... args) {		//var args
		System.out.println("(int... args): " + (args[0] + args[1] + args[2]));
	}
}













