package pojo;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private long author_id;
	private String author_name;
	private AuthorGender author_gender;
	private String author_brief;
	private List<Books> books;
	public long getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public AuthorGender getAuthor_gender() {
		return author_gender;
	}
	public void setAuthor_gender(String author_gender) {
		this.author_gender = AuthorGender.valueOf(author_gender);
	}
	public String getAuthor_brief() {
		return author_brief;
	}
	public void setAuthor_brief(String author_brief) {
		this.author_brief = author_brief;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		List<String> list=new ArrayList<String>();
		for(Books b:books) {
			list.add("《"+b.getBook_name()+"》");
		}
		
		return "Author {author_id=" + author_id + ", 作者：" + author_name + ", 性别：" + author_gender
				+ ", 作者简介：" + author_brief + ", 编写书籍：" + list + "}";
	}
	
	
	
}
