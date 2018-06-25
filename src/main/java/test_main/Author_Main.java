package test_main;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.AuthorMapper;
import pojo.Author;
import pojo.Books;






public class Author_Main {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		AuthorMapper mapper=context.getBean(mapper.AuthorMapper.class);
		//通过作者姓名来查找其所编写的书籍
		Author author=mapper.findBooksByAuthorName("Martin Fowler");//Martin Fowler
		
			PrintAuthor(author);	
		
		System.out.println();
		
		//通过作者id来查找该作者所编写的书籍以及出版社等相关信息
		System.out.println("通过ID查找：");
		Author author2=mapper.findInfoByID(1002L);
		
			PrintAuthor(author2);	
		
		System.out.println();
		
		//查询打印数据库中所有作者的信息（包括所编写的书籍及书籍对应的出版社信息）
		System.out.println("打印所有作者相关信息：--------------------------");
		List<Author> authorList=mapper.findAllInfo();
		for(Author a:authorList) {
			PrintAuthor(a);
		}
	}
	/**
	 * 打印单个作者相关信息
	 * @param author
	 */
	private static void PrintAuthor(Author author) {
		System.out.println("作者："+author.getAuthor_name()+"，【"+author.getAuthor_gender()+"】，"+
	author.getAuthor_brief());		
		
		for(Books book:author.getBooks()) {
			System.out.println("\t《"+book.getBook_name()+"》:"+book.getBook_brief()+"，出版社：【"+book.getPublisher().getPublisher_name()+"】");
			}
	}
}
