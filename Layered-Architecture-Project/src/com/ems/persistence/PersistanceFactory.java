package com.ems.persistence;

public class PersistanceFactory {

	public static EmployeeRepository getRepository(String input) {
		
		return switch (input) {
		case "inmemory", "list", "collection" ->
			 new InMemoryRepository();
		
			
		case "db", "mysql", "rdbms" ->
			new DbRepository();
		
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + input);
		};
	}
}
