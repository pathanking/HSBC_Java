package oop.inheritance;

public class ComputerBook extends Book {
	String genre;
	String language;

	ComputerBook(int bid, String bname, String genre, String language) {
		super(bid, bname);
		this.genre = genre;
		this.language = language;
	}

	@Override
	void read() {
		System.out.println("Reading Book " + bname + " of " + this.genre);
	}

	@Override
	public String toString() {
		return "ComputerBook [genre=" + genre + ", language=" + language + ", bid=" + bid + ", bname=" + bname + "]";
	}
}