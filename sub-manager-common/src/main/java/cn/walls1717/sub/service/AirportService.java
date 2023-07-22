package cn.walls1717.sub.service;

import java.util.List;

import cn.walls1717.sub.pojo.dto.AirportSaveDTO;
import cn.walls1717.sub.pojo.entity.Airport;

/**
 * 机场
 *
 * @author Jeong Geol
 */
public interface AirportService {

	/**
	 * 保存机场数据
	 *
	 * @param airportSaveDTO 数据
	 * @author Jeong Geol
	 */
	void saveAirport(AirportSaveDTO airportSaveDTO);

	/**
	 * 查询所有机场数据
	 *
	 * @return java.util.List<cn.walls1717.sub.pojo.entity.Airport>
	 * @author Jeong Geol
	 */
	List<Airport> list();
}
