package mapper;

import java.util.List;

import pojo.BookComment;

public interface BookCommentMapper {
	/**
	 * 通过book_id查询相关评论
	 * @param id
	 * @return
	 */
	public List<BookComment> findOne(long id);
}
