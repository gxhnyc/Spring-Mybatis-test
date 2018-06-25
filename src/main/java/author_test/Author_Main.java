package author_test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mapper.AuthorMapper;
import pojo.Author;






public class Author_Main {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		AuthorMapper mapper=context.getBean(mapper.AuthorMapper.class);
		
		List<Author> list=mapper.findBooksByAuthorName("Martin Fowler");//Martin Fowler
		for(Author au:list) {
			System.out.println(au);
		}
		
		
	}
}
