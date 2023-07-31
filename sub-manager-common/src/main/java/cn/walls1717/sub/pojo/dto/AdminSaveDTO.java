package cn.walls1717.sub.pojo.dto;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("保存管理员DTO")
public class AdminSaveDTO {

	@NotBlank(message = "用户名不能为空")
	@ApiModelProperty("用户名")
	private String username;

	@NotBlank(message = "密码不能为空")
	@ApiModelProperty("密码")
	private String password;

	@ApiModelProperty("邮箱")
	private String email;
}
