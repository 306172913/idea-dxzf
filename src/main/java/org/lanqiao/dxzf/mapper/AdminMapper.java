package org.lanqiao.dxzf.mapper;

import java.util.List;

import org.lanqiao.dxzf.entity.Admin;

public interface AdminMapper {
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	public int insertAdmin(Admin admin);
	/**
	 * 删除管理员（通过管理员ID）
	 * @param aid
	 * @return
	 */
	public int deleteAdmin(Integer aid);
	/**
	 * 更新管理员信息（根据更新的管理员信息）
	 * @param admin
	 * @return
	 */
	public int updateAdmin(Admin admin);
	/**
	 * 查询所有的管理员信息
	 * @return
	 */
	public List<Admin> selectAllAdmins();
	/**
	 * 模糊查询管理员信息（通过管理员名字）
	 * @param aname
	 * @return
	 */
	public Admin selectAdminByName(String aname);
	/**
	 * 查询管理员的信息（包括角色信息，和权限信息）
	 * 1.实现用户登录功能
	 */
	public List<Admin> selectAllAdmin_Role_Priv(Admin admin);
}
