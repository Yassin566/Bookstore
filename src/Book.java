import java.sql.Date;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private float price;
	private Date releaseDate;
	
	
	
	
	
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, float price, Date releaseDate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
		
		
	}
	
	public Book(int bookId, String title, String author, float price, Date releaseDate) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	

}
