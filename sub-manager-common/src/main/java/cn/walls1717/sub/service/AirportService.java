package cn.walls1717.sub.service;

import java.util.List;

import cn.walls1717.sub.pojo.dto.AirportSaveDTO;
import cn.walls1717.sub.pojo.entity.Airport;

public interface AirportService {
	void saveAirport(AirportSaveDTO airportSaveDTO);

	List<Airport> list();
}
