package mapper;

import java.util.List;

import pojo.Author;

public interface AuthorMapper {
	/**
	 * 通过作者姓名查找作者性别及所著书籍
	 * @param authorname
	 */
	public List<Author> findBooksByAuthorName(String authorname);
}
