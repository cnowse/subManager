package cn.walls1717.sub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import cn.walls1717.sub.pojo.entity.Admin;

/**
 * 管理员
 *
 * @author Jeong Geol
 */
public interface AdminRepository extends JpaRepository<Admin, Long>, CrudRepository<Admin, Long> {

	/**
	 * 根据 username 查找管理员数据
	 *
	 * @param username username
	 * @return cn.walls1717.sub.pojo.entity.Admin
	 * @author Jeong Geol
	 */
	Optional<Admin> findByUsername(String username);
}