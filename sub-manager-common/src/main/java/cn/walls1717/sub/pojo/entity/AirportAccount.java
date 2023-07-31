package cn.walls1717.sub.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cn.walls1717.sub.constant.SubType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("机场账户")
public class AirportAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ApiModelProperty("ID")
	private Long id;

	@Column(name = "account", length = 60)
	@ApiModelProperty("账户，通常是邮箱")
	private String account;

	@Column(name = "password")
	@ApiModelProperty("密码")
	private String password;

	@Column(name = "has_sub", nullable = false)
	@ApiModelProperty("是否有订阅？true：有订阅，false：无订阅")
	private Boolean hasSub = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "sub_type", length = 30)
    @ApiModelProperty("账户的订阅类型")
    private SubType subType;

	@Column(name = "sub")
	@ApiModelProperty("订阅")
	private String sub;

	@ManyToOne
	@JoinColumn(name = "airport_id")
	private Airport airport;

}
