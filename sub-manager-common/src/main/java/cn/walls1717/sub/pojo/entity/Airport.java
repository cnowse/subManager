package cn.walls1717.sub.pojo.entity;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 机场
 */
@Setter
@Getter
@Entity
@Table(name = "airport")
@Schema(description = "机场")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Schema(description = "ID")
	private Long id;

	@Column(name = "name", nullable = false, length = 30)
	@Schema(description = "机场名称")
	private String name;

	@Column(name = "url")
	@Schema(description = "机场地址")
	private String url;

	@OneToMany(mappedBy = "airport", cascade = CascadeType.REMOVE, orphanRemoval = true)
	@Schema(description = "机场账号")
	private List<AirportAccount> airportAccounts;
}