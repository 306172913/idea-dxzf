package org.lanqiao.dxzf.mapper;

import java.util.List;

import org.lanqiao.dxzf.entity.Role;

public interface RoleMapper {
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public int insertRole(Role role);
	/**
	 * 删除角色（根据角色id）
	 * @param rid
	 * @return
	 */
	public int deleteRole(Integer rid);
	/**
	 * 修改角色信息
	 * @param role
	 * @return
	 */
	public int updateRole(Role role);
	/**
	 * 没有查询所有角色信息
	 * @return
	 */
	public List<Role> selectAllRoles();
	/**
	 * 根据管理员id查询所有角色信息 1-多
	 * @param aid
	 * @return
	 */
	public List<Role> selectAllRoleByAid(int aid);
	/**
	 * 批量添加角色
	 */
	public int insertRoles(List<Role> list);
}
