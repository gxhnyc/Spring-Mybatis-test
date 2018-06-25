package test_main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mapper.BookCommentMapper;
import pojo.BookComment;




public class comment_test {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		BookCommentMapper mapper=context.getBean(mapper.BookCommentMapper.class);
		
		List<BookComment> list=mapper.findOne(1002L);
		for(BookComment bc:list) {
			System.out.println(bc);
		}
		
		
	}
}
