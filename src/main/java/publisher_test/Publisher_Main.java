package publisher_test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mapper.PublisherMapper;
import pojo.Books;
import pojo.Publisher;


public class Publisher_Main {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		PublisherMapper mapper=context.getBean(mapper.PublisherMapper.class);
		//得到出版社名字
		 Publisher publisher=mapper.findOne(1002);
		//得到图书名称
		 List<Books> booklist=publisher.getBooks();
		System.out.println(publisher.getPublisher_name()+":");
		for(Books book:booklist) {
			System.out.print("《"+book.getBook_name()+"》,作者：【");
			for(int i=0;i<book.getAuthor().size();i++) {
				System.out.print(book.getAuthor().get(i).getAuthor_name());
				if((i+1)!=book.getAuthor().size()) {
					System.out.print(",");
				}
				else System.out.println("】");
			}
			
		}
		
		
	}
}
