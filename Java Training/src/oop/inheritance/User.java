package oop.inheritance;

public class User {
	int uid;
	String name;

	User(int uid, String name) {
		this.uid = uid;
		this.name = name;
	}

	User(int uid) {
		this(uid, "User1");
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + "]";
	}
}