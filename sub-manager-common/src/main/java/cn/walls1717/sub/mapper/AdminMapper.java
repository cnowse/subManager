package cn.walls1717.sub.mapper;

import cn.walls1717.sub.pojo.dto.AdminSaveDTO;
import cn.walls1717.sub.pojo.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminMapper {

	AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

	/**
	 * 将 AdminSaveDTO 转换为 Admin
	 *
	 * @param adminSaveDTO AdminSaveDTO
	 * @return Admin
	 */
	Admin fromSaveDto(AdminSaveDTO adminSaveDTO);
}
