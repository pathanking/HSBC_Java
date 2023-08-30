package com.lms.persistence;

import java.util.List;

import com.lms.business.Book;
import com.lms.excepetions.BookAlreadyExistsException;
import com.lms.excepetions.BookNotFoundException;

public class ListImpl implements LibraryRepository {

	@Override
	public String add(Book book) throws BookAlreadyExistsException {
		return null;
	}

	@Override
	public Book fetch(int bookId) throws BookNotFoundException {

		return null;
	}

	@Override
	public List<Book> show() {
		// TODO Auto-generated method stub
		return null;
	}
}