package com.mycompany.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author razaa
 * @apiNote JDBC Transactions
 *
 */

public class JdbcDemo4 {
	public static void main(String[] args) {
		Connection conn = JdbcUtil.getConn();

		try {
			conn.setAutoCommit(false);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try (PreparedStatement insertPS = 
				conn.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?,?)");
				PreparedStatement updatePS = 
						conn.prepareStatement("UPDATE employee SET city=? WHERE eid=?");) {

			insertPS.setInt(1, 108);
			insertPS.setString(2, "ayan");
			insertPS.setString(3, "shaikh");
			insertPS.setString(4, "Kolkata");
			insertPS.setInt(5, 33);
			insertPS.setString(6, "ayan@e.com");

			updatePS.setString(1, "Bhopal");
			updatePS.setInt(2, 107);

			insertPS.executeUpdate();
			updatePS.executeUpdate();

			conn.commit();
			System.out.println("transaction done!");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}