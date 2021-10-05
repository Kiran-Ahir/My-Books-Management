package mybooksmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mybooksmanagement.model.Book;

@Repository
public class BooksDaoImpl implements BooksDao {
	
	@Autowired
	public HibernateTemplate hibernateTemplate;

	public Book getSingleBook(int bookId) {
		return this.hibernateTemplate.get(Book.class, bookId);
	}

	public List<Book> getAllBooks() {
		List<Book> books = this.hibernateTemplate.loadAll(Book.class);
		return books;
	}

	@Transactional
	public void deleteBook(int bookId) {
		Book book = this.hibernateTemplate.get(Book.class, bookId);
		this.hibernateTemplate.delete(book);
	}

	@Transactional
	public void saveBook(Book book) {
		this.hibernateTemplate.saveOrUpdate(book);
	}

}
