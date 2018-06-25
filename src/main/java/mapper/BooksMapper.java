package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import pojo.Books;

public interface BooksMapper {
	// 1.查询所有Book信息
	public List<Books> findAll();

	/**
	 * 通过书籍id查找书籍相关信息及出版社名
	 * @param id
	 * @return Books
	 */
	public Books findOne(long id);

	// 3.创建一个Book
	public void createOne(Books op);

	// 4.删除一个Book
	public void deleteOne(long id);

	// 5.修改一个Book
	public void updateOne(Books op);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
