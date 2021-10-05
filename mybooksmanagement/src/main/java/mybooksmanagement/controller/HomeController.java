package mybooksmanagement.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import mybooksmanagement.model.Book;
import mybooksmanagement.service.BooksService;

@Controller
public class HomeController {
	
	@Autowired
	public BooksService booksService;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Book> books = booksService.getAllBooks();
		
		model.addAttribute("books", books);
		
		return "home";
	}
	
	@RequestMapping("/add")
	public String saveBook(Model model) {
		model.addAttribute("title", "Add Book");
		return "add-book";
	}
	
	@RequestMapping(path="/handle-book", method = RequestMethod.POST)
	public RedirectView addBook(@ModelAttribute Book book, HttpServletRequest request) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
	    
	    book.setDateModified(formatter.format(date));
		
		this.booksService.saveBook(book);
	
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteBook(@PathVariable("id") int bookId, HttpServletRequest request) {
		this.booksService.deleteBook(bookId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String updateBook(@PathVariable("id") int bookId, Model model) {
		
		Book book = this.booksService.getSingleBook(bookId);
		model.addAttribute("book", book);
		model.addAttribute("title", "Update Book");
		return "update-book";
	}
	
	@RequestMapping("/book/{id}")
	public String bookDetails(@PathVariable("id") int bookId, Model model) {
		Book book = this.booksService.getSingleBook(bookId);
		model.addAttribute("book", book);
		model.addAttribute("title", book.name);
		return "book-details";
	}
	
}
