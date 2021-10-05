package mybooksmanagement.service;

import java.util.List;

import mybooksmanagement.model.Book;

public interface BooksService {
	
	public Book getSingleBook(int bookId);
	public List<Book> getAllBooks();
	public void saveBook(Book book);
	public void deleteBook(int bookId);
}
