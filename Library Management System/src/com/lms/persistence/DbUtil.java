package com.lms.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	private static Connection con;

	public static Connection getCon() {
		FileInputStream fis = null;

		try {
			if (con == null)
				fis = new FileInputStream("book.properties");

			Properties p = new Properties();
			p.load(fis);
			String url = p.getProperty("url");
			String un = p.getProperty("username");
			String pw = p.getProperty("password");

			con = DriverManager.getConnection(url, un, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return con;
	}
}