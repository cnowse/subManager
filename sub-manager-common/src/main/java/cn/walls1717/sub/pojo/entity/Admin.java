package cn.walls1717.sub.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 管理员
 */
@Getter
@Setter
@Entity
@Schema(description = "管理员")
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@Schema(description = "ID")
	private Long id;

	@Column(name = "username", nullable = false, unique = true, length = 30)
	@Schema(description = "用户名 唯一")
	private String username;

	@Column(name = "password", nullable = false)
	@Schema(description = "密码")
	private String password;

	@Column(name = "email", length = 30)
	@Schema(description = "邮箱")
	private String email;

}