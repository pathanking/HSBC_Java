package com.mycompany.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Connection connection = JdbcUtil.getConn();

		System.out.println("Enter Employee ID");
		int id = scanner.nextInt();

		System.out.println("Enter Employee First Name");
		String fn = scanner.next();

		System.out.println("Enter Employee Last Name");
		String ln = scanner.next();

		System.out.println("Enter Employee City");
		String city = scanner.next();

		System.out.println("Enter Employee Dept ID");
		int deptId = scanner.nextInt();

		System.out.println("Enter Employee Email");
		String email = scanner.next();

		try (PreparedStatement ps = connection
				.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?,?)");) {

			ps.setInt(1, id);
			ps.setString(2, fn);
			ps.setString(3, ln);
			ps.setString(4, city);
			ps.setInt(5, deptId);
			ps.setString(6, email);
			
			ps.executeUpdate();
			
			System.out.println("RECORD INSERTED");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}