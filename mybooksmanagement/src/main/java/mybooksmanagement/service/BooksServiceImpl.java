package mybooksmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mybooksmanagement.dao.BooksDao;
import mybooksmanagement.model.Book;

@Service
public class BooksServiceImpl implements BooksService {
	
	@Autowired
	public BooksDao booksDao;

	public Book getSingleBook(int bookId) {
		return booksDao.getSingleBook(bookId);
	}

	public List<Book> getAllBooks() {
		return booksDao.getAllBooks();
	}

	public void saveBook(Book book) {
		booksDao.saveBook(book);
	}

	public void deleteBook(int bookId) {
		booksDao.deleteBook(bookId);
	}

}
