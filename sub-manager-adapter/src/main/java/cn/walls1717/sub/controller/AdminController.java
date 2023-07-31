package cn.walls1717.sub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.dev33.satoken.annotation.SaIgnore;
import cn.walls1717.sub.pojo.dto.AdminSaveDTO;
import cn.walls1717.sub.service.AdminService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

/**
 * 管理员接口
 *
 * @author Jeong Geol
 */
@Api(tags = "管理员接口")
@RestController
@RequiredArgsConstructor
@RequestMapping("admin")
public class AdminController {

	private final AdminService adminService;

	@PostMapping
	public void save(@RequestBody AdminSaveDTO adminSaveDTO) {
		adminService.save(adminSaveDTO);
	}

	@SaIgnore
	@PostMapping("/login")
	public String login(AdminSaveDTO adminSaveDTO) {
		return adminService.login(adminSaveDTO);
	}

}
