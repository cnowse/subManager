package cn.walls1717.sub.pojo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 管理员
 */
@Getter
@Setter
@Entity
@ApiModel("管理员")
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@ApiModelProperty("ID")
	private Long id;

	@Column(name = "username", nullable = false, unique = true, length = 30)
	@ApiModelProperty("用户名 唯一")
	private String username;

	@Column(name = "password", nullable = false)
	@ApiModelProperty("密码")
	private String password;

	@Column(name = "email", length = 30)
	@ApiModelProperty("邮箱")
	private String email;

}