package com.mycompany.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {

	public static void main(String[] args) {
		Connection conn = JdbcUtil.getConn();

		System.out.println("Display All the Records");

		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT *FROM employee");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) 
						+ "\t" + resultSet.getString(2) 
						+ "\t" + resultSet.getString(3)
						+ "\t" + resultSet.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}