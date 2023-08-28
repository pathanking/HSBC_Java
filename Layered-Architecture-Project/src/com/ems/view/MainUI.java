package com.ems.view;

import java.util.List;
import java.util.Scanner;

import com.ems.business.Employee;
import com.ems.business.EmployeeService;
import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.persistence.DbRepository;
import com.ems.persistence.InMemoryRepository;
import com.ems.persistence.PersistanceFactory;

public class MainUI {
	public static void menu() {
		System.out.println("1. ADD Employee");
		System.out.println("2. SHOW Employees");
		System.out.println("3. SEARCH Employee");
		System.out.println("4. DELETE Employee");
		System.out.println("5. Exit Application");
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your DB Choice >>>");
			String dbChoice = scanner.next();

			EmployeeService service = new EmployeeService(PersistanceFactory.getRepository(dbChoice));

			int choice = 0;
			do {
				menu();
				System.out.println("Enter Your Choice >>>");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Employee Name");
					String ename = scanner.next();
					service.addEmployee(ename);
					break;
				case 2:
					List<Employee> employees = service.showEmployees();
					employees.forEach(System.out::println);
					break;
				case 3:
					System.out.println("Enter Employee ID");
					int eid = scanner.nextInt();

					try {
						System.out.println(service.getEmployee(eid));
					} catch (EmployeeNotFoundException e) {
						System.out.println(e.getMessage());
					}

					break;
				case 4:
					System.out.println("Enter Employee ID");
					int eid2 = scanner.nextInt();
					try {
						System.out.println(service.deleteEmployee(eid2));
					} catch (EmployeeNotFoundException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 5:
					System.out.println("Exiting Application!");
					break;

				default:
					System.out.println("Invalid Choice!!");
				}
			} while (choice != 5);
		}
	}
}
