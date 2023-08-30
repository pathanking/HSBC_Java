package com.mycompany.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	private static Connection con;

	public static Connection getConn() {
		try {
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
