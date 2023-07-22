package cn.walls1717.sub.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import cn.walls1717.sub.pojo.dto.AirportSaveDTO;
import cn.walls1717.sub.pojo.entity.Airport;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AirportMapper {

    AirportMapper INSTANCE = Mappers.getMapper(AirportMapper.class);

    AirportSaveDTO toSaveDto(Airport airport);

    Airport fromSaveDto(AirportSaveDTO airportSaveDTO);
}
