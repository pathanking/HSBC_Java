package com.lms.persistence;

public class Factory {

	public static LibraryRepository repository;

	public static LibraryRepository getRepository(int key) {
		return switch (key) {
		case 1 -> new DbImpl();
		case 2 -> new ListImpl();

		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};
	}
}
