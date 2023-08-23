package oop.inheritance;

public abstract class Book {
	int bid;
	String bname;
	
	Book(int bid, String bname){
		this.bid = bid;
		this.bname = bname;
	}
	
	abstract void read();
}