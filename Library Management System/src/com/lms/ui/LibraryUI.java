package com.lms.ui;

import java.util.Scanner;

import com.lms.business.LibraryService;
import com.lms.excepetions.BookAlreadyExistsException;
import com.lms.excepetions.BookNotFoundException;
import com.lms.persistence.Factory;
import com.lms.persistence.LibraryRepository;

public class LibraryUI {

	public static void menu() {
		System.out.println("\t\t\t Welcome to Library Management System");
		System.out.println("\t\t\t [1] ADD Book");
		System.out.println("\t\t\t [2] GET Book");
		System.out.println("\t\t\t [3] SHOW Books");
		System.out.println("\t\t\t [4] Exit Application");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Enter Your Choice of Repo >>>");
		System.out.println("\t\t\t (1) DbImpl   (2) ListImpl ");
		int choice = sc.nextInt();

		LibraryRepository repo = Factory.getRepository(choice);

		LibraryService service = new LibraryService(repo);
		int c = 0;
		do {
			menu();
			System.out.println("Enter Your Choice of Operation [1][2][3]");
			c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.println("Enter Book ID");
				Integer bookId = sc.nextInt();
				System.out.println("Enter Book Title");
				String title = sc.next();
				System.out.println("Enter Author Name");
				String author = sc.next();
				try {
					System.out.println(service.addBook(bookId, title, author));
				} catch (BookAlreadyExistsException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter Book ID");
				int bId = sc.nextInt();
				try {
					System.out.println(service.fetchBook(bId));
				} catch (BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				service.showBooks().forEach(System.out::println);
				break;
			case 4:
				System.out.println("Application will be terminated!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input... Try Again!!");
				break;
			}
		} while (c != 4);

	}

}
