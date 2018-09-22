package org.lanqiao.dxzf.mapper;

import java.util.List;

import org.lanqiao.dxzf.entity.Priv;

public interface PrivMapper {
	/**
	 * 添加权限信息
	 * @param priv
	 * @return
	 */
	public int insertPriv(Priv priv);
	/**
	 * 删除权限信息（根据权限ID）
	 * @param id
	 * @return
	 */
	public int deletePriv(Integer id);
	/**
	 * 根据权限信息更新权限信息（ID）
	 * @param priv
	 * @return
	 */
	public int updatePriv(Priv priv);
	/**
	 * 查询所有权限信息
	 * @return
	 */
	public List<Priv> selectAllPrivs();
	/**
	 * 查询所有权限信息（根据角色rid）
	 * @param rid
	 * @return
	 */
	public List<Priv> selectAllPrivByRid(int rid);
	/**
	 * 查询所有权限信息根据Admin id
	 */
	public List<Priv> selectAllPrivByAid(int aid);
}
