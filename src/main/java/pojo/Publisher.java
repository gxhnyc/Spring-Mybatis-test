package pojo;


import java.util.List;


public class Publisher {
	private long publisher_id;
	private String publisher_name;
	private String publisher_brief;
	private List<Books> books;
	
	public long getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(long publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public String getPublisher_brief() {
		return publisher_brief;
	}
	public void setPublisher_brief(String publisher_brief) {
		this.publisher_brief = publisher_brief;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
		
	
	
}
