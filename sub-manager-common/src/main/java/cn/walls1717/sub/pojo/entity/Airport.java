package cn.walls1717.sub.pojo.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 机场
 */
@Setter
@Getter
@Entity
@Table(name = "airport")
@ApiModel("机场")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ApiModelProperty("ID")
	private Long id;

	@Column(name = "name", nullable = false, length = 30)
	@ApiModelProperty("机场名称")
	private String name;

	@Column(name = "url")
	@ApiModelProperty("机场地址")
	private String url;

    @Column
    @ApiModelProperty("创建日期")
    private LocalDate createDate;

	@OneToMany(mappedBy = "airport", cascade = CascadeType.REMOVE, orphanRemoval = true)
	@ApiModelProperty("机场账号")
	private List<AirportAccount> airportAccounts;
}