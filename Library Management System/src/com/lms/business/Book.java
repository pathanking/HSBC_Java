package com.lms.business;

import java.util.Objects;

public class Book {
	private Integer bookId;
	private String title;
	private String author;
	private static int count;

	// add more fields
	public Book(String title, String author) {
		this.bookId = count++;
		this.title = title;
		this.author = author;
	}

	public Book(Integer bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getBookId() {
		return bookId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
	}

}
