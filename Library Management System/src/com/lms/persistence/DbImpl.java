package com.lms.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lms.business.Book;
import com.lms.excepetions.BookAlreadyExistsException;
import com.lms.excepetions.BookNotFoundException;

public class DbImpl implements LibraryRepository {
	private static Connection con;

	public DbImpl() {
		con = DbUtil.getCon();
	}

	@Override
	public String add(Book book) throws BookAlreadyExistsException {
		String response = null;
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO book VALUES(?,?,?)");

			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());

			int res = ps.executeUpdate();

			if (res > 0)
				response = "Record Inserted Successfully!";

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return response;
	}

	@Override
	public Book fetch(int bookId) throws BookNotFoundException {
		PreparedStatement ps = null;
		Book b = null;
		try {
			ps = con.prepareStatement("SELECT * FROM book WHERE bookid = ?");

			ps.setInt(1, bookId);

			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String title = resultSet.getString(2);
				String author = resultSet.getString(3);

				b = new Book(id, title, author);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	@Override
	public List<Book> show() {
		Book book = null;
		PreparedStatement ps = null;
		List<Book> list = new ArrayList<>();
		try {
			ps = con.prepareStatement("SELECT *FROM book");
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				book = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				list.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
}
