package pojo;

public class BookComment {
	private long bc_id;
	private Books book;
	private String comments;
	
	public long getBc_id() {
		return bc_id;
	}
	public void setBc_id(long bc_id) {
		this.bc_id = bc_id;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "BookComment :bc_id=" + bc_id + ", book_name=" + book.getBook_name() + ", comments=" + comments +
				"["+book.getPublisher().getPublisher_name()+"]";
	}
	
	
}
