package student_crud;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mapper.StudentMapper;
import pojo.Gender;
import pojo.Student;


public class Main {

	public static void main(String[] args) { 
		
	AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(student_crud.Appconfig.class);
	
	StudentMapper mapper=context.getBean(mapper.StudentMapper.class);
	List<Student> list=mapper.findAll();
	
	for(Student stu:list) {
		System.out.println(stu);
	}
	
	System.out.println("-------------------------");
	
	System.out.println("查找女性模特：\n"+mapper.findByGenderAndMajor(Gender.Female, "模特"));
	
	}
}
