package test_main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.PublisherMapper;
import pojo.Books;
import pojo.Publisher;


public class Publisher_Main {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		PublisherMapper mapper=context.getBean(mapper.PublisherMapper.class);
		System.out.println("findOne():------");
		//查询单个出版社信息
		 Publisher publisher=mapper.findOne(1002);
		PrintPublisher(publisher);
		System.out.println("--------------------------------------------------------");
		System.out.println("findAll():------");
		//查询所有出版社信息
		List<Publisher> plist=mapper.findAll();
		for(Publisher p:plist) {
			PrintPublisher(p);
		}
		
	}
	/**
	 * 打印单个个出版社出版的所有书籍以及书籍的作者信息
	 * @param publisher
	 */
	private static void PrintPublisher(Publisher publisher) {
		//得到图书
		 List<Books> booklist=publisher.getBooks();
		System.out.println(publisher.getPublisher_name()+":");
		for(Books book:booklist) {
			System.out.print("\t《"+book.getBook_name()+"》,作者：【");
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
