package mybooksmanagement.dao;

import java.util.List;

import mybooksmanagement.model.Book;

public interface BooksDao {
	
	public Book getSingleBook(int bookId);
	public List<Book> getAllBooks();
	public void saveBook(Book book);
	public void deleteBook(int bookId);

}
