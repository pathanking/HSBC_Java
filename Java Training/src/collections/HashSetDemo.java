package collections;

import java.util.HashSet;
import java.util.Objects;



public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("sl");
		hashSet.add("pak");
		hashSet.add("ind");
		hashSet.add("afg");
		hashSet.add("bd");

		System.out.println(hashSet);

		HashSet<Emp> emps = new HashSet<>();
		emps.add(new Emp(1, "sai"));
		emps.add(new Emp(2, "bob"));
		emps.add(new Emp(5, "sam"));
		emps.add(new Emp(7, "lisa"));
		emps.add(new Emp(9, "john"));

		HashSet<Emp> superset = new HashSet<>();
		superset.add(new Emp(11, "murugan"));
		superset.add(new Emp(22, "ramya"));

		superset.addAll(emps);
		superset.forEach(System.out::println);

		System.out.println(superset.contains(new Emp(9, "john")));
		System.out.println(superset.isEmpty());
	}
}




