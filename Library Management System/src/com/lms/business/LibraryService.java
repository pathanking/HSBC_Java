package com.lms.business;

import java.util.List;

import com.lms.excepetions.BookAlreadyExistsException;
import com.lms.excepetions.BookNotFoundException;
import com.lms.persistence.LibraryRepository;

public class LibraryService {

	private LibraryRepository repo;

	public LibraryService(LibraryRepository repo) {
		this.repo = repo;
	}

	public String addBook(Integer bookId, String title, String author) throws BookAlreadyExistsException {
		Book book = new Book(bookId, title, author);

		try {
			return repo.add(book);
		} catch (BookAlreadyExistsException e) {
			throw e;
		}
	}

	public Book fetchBook(int bookId) throws BookNotFoundException {
		try {
			return repo.fetch(bookId);
		} catch (BookNotFoundException e) {
			throw e;
		}
	}

	public List<Book> showBooks() {
		return repo.show();
	}
}
