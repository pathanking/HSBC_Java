package oop.inheritance;

public class Admin extends User {
	boolean access;
	String contact;

	Admin(int uid, String name, boolean access, String contact) {
		super(uid, name);
		this.access = access;
		this.contact = contact;
	}

	public String toString() {
		return "Admin Details [access=" + access + ", contact=" + contact + ", uid=" + uid + ", name=" + name + "]";
	}
}
