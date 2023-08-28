package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> teams = new HashMap<>();
		teams.put("india", 1);
		teams.put("pak", 2);
		teams.put("pak", 7);
		teams.put("aus", 3);
		teams.put("england", 4);
		teams.put("sl", 5);
		teams.put(null, null);

		HashMap<Integer, String> teams2 = new HashMap<>(11);
		teams2.put(122, "Ind");
		teams2.put(242, "Ind");
		teams2.put(232, "Aus");
		teams2.put(343, "Pak");
		teams2.put(543, "Afg");
		teams2.forEach((k, v) -> {
			System.out.println("bucket, Key, Value " + k.hashCode() % 11 + " " + k + " " + v);
		});
	}
}