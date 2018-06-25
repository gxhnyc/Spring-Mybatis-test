package mapper;

import java.util.List;

import pojo.Publisher;

public interface PublisherMapper {
	/**
	 * 通过出版社ID查询出版社名字、简介及其所出版的图书的书名、作者
	 * @param id
	 * @return
	 */
	public Publisher findOne(long id);
}
