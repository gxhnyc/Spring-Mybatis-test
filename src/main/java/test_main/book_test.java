package test_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.BooksMapper;


public class book_test {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		BooksMapper mapper=context.getBean(mapper.BooksMapper.class);
		
		System.out.println(mapper.findOne(1002L));
		
		
	}
}
