package collections;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> maps = new TreeMap<>();
		maps.put("ind", "delhi");
		maps.put("china", "beijing");
		maps.put("bdesh", "dhaka");
		maps.put("pak", "i-bad");
		maps.put("afg", "kabul");
		maps.entrySet().forEach(System.out::println);

		TreeMap<Emp, String> emps = new TreeMap<>();

		emps.put(new Emp(9, "Ram"), "follow coding conventions");
		emps.put(new Emp(2, "Sam"), "comments must be written");
		emps.put(new Emp(1, "Jhon"), "Good Effort");
		emps.put(new Emp(3, "Doe"), "Keep it up!");
		emps.put(new Emp(4, "Bob"), "follow best practices");
		emps.put(new Emp(5, "Mary"), "loose coupling shd be there");
		emps.put(new Emp(6, "Zaid"), "don't do tight coupling");
		emps.put(new Emp(7, "Sami"), "re upload your code");
		emps.put(new Emp(10, "Ali"), "copy past issue in your code");

		emps.entrySet().forEach(System.out::println);
	}
}
