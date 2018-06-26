package mapper;

import java.util.List;

import pojo.Role;

public interface RoleMapper {
	/**
	 * 查询角色列表（id 名字 描述 及其权限）
	 * @return
	 */
	public List<Role> findAll();
}
