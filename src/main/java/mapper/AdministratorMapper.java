package mapper;

import java.util.List;

import pojo.Administrator;

public interface AdministratorMapper {
	/**
	 * 通过ID 查询管理员详情（id 用户名 密码 是否禁用 角色及其权限）
	 * @param id
	 * @return
	 */
	public Administrator findOne(Long id);
	/**
	 * 查询管理员列表（id 用户名 是否禁用 角色）
	 * @return
	 */
	public List<Administrator> findAll();
}
