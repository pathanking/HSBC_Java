package oop.inheritance;

public class ScienceBook extends Book {

	String genre;

	ScienceBook(int bid, String bname, String genre) {
		super(bid, bname);
		this.genre = genre;
	}

	@Override
	void read() {
		System.out.println("Reading Book " + bname + " of " + this.genre);
	}

	@Override
	public String toString() {
		return "ScienceBook [genre=" + genre + ", bid=" + bid + ", bname=" + bname + "]";
	}
}