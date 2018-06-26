package mapper;

import java.util.List;

import pojo.Limits;

public interface LimitsMapper {
	/**
	 *  查询权限列表（id 名字 描述）
	 * @return
	 */
	public List<Limits> findAll();
}
