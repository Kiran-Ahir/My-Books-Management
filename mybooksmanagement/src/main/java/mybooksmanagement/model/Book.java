package mybooksmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String name;
	public String author;
	public String status;
	public String issuedTo;
	public String dateModified;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String author, String status, String issuedTo,
			String dateModified) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.status = status;
		this.issuedTo = issuedTo;
		this.dateModified = dateModified;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", status=" + status + ", issuedTo="
				+ issuedTo + ", dateModified=" + dateModified + "]";
	}

}
