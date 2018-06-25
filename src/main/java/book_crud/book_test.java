package book_crud;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mapper.BooksMapper;


public class book_test {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		BooksMapper mapper=context.getBean(mapper.BooksMapper.class);
		
		System.out.println(mapper.findOne(1006L));
		
		
	}
}
