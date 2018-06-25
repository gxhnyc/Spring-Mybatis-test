package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Gender;
import pojo.Student;



public interface StudentMapper {
	// 1.查询所有学生信息
	public List<Student> findAll();

	// 2.查询单个Student（传参情形a：当只有一个简单类型的参数时，mapper.xml中使用#{参数名}取值）
	public Student findOne(long id);

	// 3.创建一个Student（传参情形b：当只有一个pojo类型的参数时，mapper.xml中使用#{属性名}取值）
	public void createOne(Student op);

	// 4.删除一个Student
	public void deleteOne(long id);

	// 5.修改一个Student
	public void updateOne(Student op);
	
	//6.查找女性模特(传参情形c:当传参有多个时，需要使用 @Param("参数名")后，才能在mapper.xml中使用#{参数名}取值
	public List<Student> findByGenderAndMajor(
			@Param("s_gender") Gender gender,
			@Param("s_major") String major
			);
	
}
