package cn.walls1717.sub.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.walls1717.sub.mapper.AirportMapper;
import cn.walls1717.sub.pojo.dto.AirportSaveDTO;
import cn.walls1717.sub.pojo.entity.Airport;
import cn.walls1717.sub.repository.AirportRepository;
import cn.walls1717.sub.service.AirportService;
import lombok.RequiredArgsConstructor;

/**
 * 机场
 *
 * @author Jeong Geol
 */
@Service
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    @Override
    public void saveAirport(AirportSaveDTO airportSaveDTO) {
        airportRepository.save(AirportMapper.INSTANCE.fromSaveDto(airportSaveDTO));
    }

	@Override
	public List<Airport> list() {
		return airportRepository.findAll();
	}
}
