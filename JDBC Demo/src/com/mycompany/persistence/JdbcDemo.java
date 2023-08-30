package com.mycompany.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root",
				"root");) {
		
			try(Statement statement = connection.createStatement();){
				statement
				.executeUpdate("INSERT INTO employee VALUES(105, 'arman', 'malik', 'srinagar', 44, 'arman@e.com')");
				
				System.out.println("RECORD INSERTED!!");
			}

		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
}