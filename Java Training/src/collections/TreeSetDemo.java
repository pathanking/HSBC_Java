package collections;

import java.util.Objects;
import java.util.TreeSet;

class Emp implements Comparable<Emp> {
	int id;
	String nm;

	public Emp(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nm);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(nm, other.nm);
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", nm=" + nm + "]";
	}

	@Override
	public int compareTo(Emp o) {
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		else
			return 0;
	}
}

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> strings = new TreeSet<>();
		strings.add("uae");
		strings.add("bd");
		strings.add("afg");
		strings.add("sl");
		strings.add("pak");
		strings.add("ind");

		strings.forEach(System.out::println);

		TreeSet<Emp> emps = new TreeSet<>();
		Emp e1 = new Emp(8, "rohit");
		Emp e2 = new Emp(9, "shadab");
		Emp e3 = new Emp(7, "rashid");
		Emp e4 = new Emp(1, "chahal");
		Emp e5 = new Emp(2, "babar");

		emps.add(e5);
		emps.add(e4);
		emps.add(e2);
		emps.add(e3);
		emps.add(e1);
		emps.forEach(System.out::println);
	}
}
