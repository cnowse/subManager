package cn.walls1717.sub.serviceimpl;

import java.util.Optional;

import cn.dev33.satoken.stp.StpUtil;
import cn.walls1717.sub.mapper.AdminMapper;
import cn.walls1717.sub.pojo.dto.AdminSaveDTO;
import cn.walls1717.sub.pojo.entity.Admin;
import cn.walls1717.sub.repository.AdminRepository;
import cn.walls1717.sub.service.AdminService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

/**
 * 管理员
 */
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

	private final AdminRepository adminRepository;

	@Override
	public void save(AdminSaveDTO adminSaveDTO) {
		adminRepository.save(AdminMapper.INSTANCE.fromSaveDto(adminSaveDTO));
	}

	@Override
	public String login(AdminSaveDTO adminSaveDTO) {
		Optional<Admin> admin = adminRepository.findByUsername(adminSaveDTO.getUsername());
		admin.ifPresent(item -> StpUtil.login(item.getId()));
		return StpUtil.getTokenInfo().getTokenValue();
	}
}
