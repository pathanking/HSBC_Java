package com.lms.persistence;

import java.util.List;

import com.lms.business.Book;
import com.lms.excepetions.BookAlreadyExistsException;
import com.lms.excepetions.BookNotFoundException;

public interface LibraryRepository {
	
	String add(Book book) throws BookAlreadyExistsException;
	
	Book fetch(int bookId) throws BookNotFoundException;
	
	List<Book> show();
	
}
