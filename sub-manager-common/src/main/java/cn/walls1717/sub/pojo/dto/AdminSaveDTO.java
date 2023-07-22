package cn.walls1717.sub.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(description = "保存管理员DTO")
public class AdminSaveDTO {

	@NotBlank(message = "用户名不能为空")
	@Schema(description = "用户名")
	private String username;

	@NotBlank(message = "密码不能为空")
	@Schema(description = "密码")
	private String password;

	@Schema(description = "邮箱")
	private String email;
}
