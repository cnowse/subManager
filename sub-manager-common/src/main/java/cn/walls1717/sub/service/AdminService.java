package cn.walls1717.sub.service;

import cn.walls1717.sub.pojo.dto.AdminSaveDTO;

/**
 * 管理员
 */
public interface AdminService {

	/**
	 * 保存管理员数据
	 *
	 * @param adminSaveDTO 数据
	 * @author Jeong Geol
	 */
	void save(AdminSaveDTO adminSaveDTO);

	/**
	 * 登录
	 *
	 * @param adminSaveDTO 数据
	 * @return token
	 */
	String login(AdminSaveDTO adminSaveDTO);
}
