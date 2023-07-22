package cn.walls1717.sub.pojo.entity;

import cn.walls1717.sub.constant.SubType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 机场账户
 *
 * @author Jeong Geol
 */
@Setter
@Getter
@Entity
@Table(name = "airport_account")
@Schema(description = "机场账户")
public class AirportAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Schema(description = "ID")
	private Long id;

	@Column(name = "account", length = 60)
	@Schema(description = "账户，通常是邮箱")
	private String account;

	@Column(name = "password")
	@Schema(description = "密码")
	private String password;

	@Column(name = "has_sub", nullable = false)
	@Schema(description = "是否有订阅？true：有订阅，false：无订阅")
	private Boolean hasSub = false;

	@Enumerated
	@Column(name = "sub_type")
	@Schema(description = "账户的订阅类型")
	private SubType subType;

	@Column(name = "sub")
	@Schema(description = "订阅")
	private String sub;

	@ManyToOne
	@JoinColumn(name = "airport_id")
	private Airport airport;

}
