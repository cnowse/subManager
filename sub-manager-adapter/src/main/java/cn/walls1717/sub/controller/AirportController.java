package cn.walls1717.sub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.walls1717.sub.pojo.dto.AirportSaveDTO;
import cn.walls1717.sub.pojo.entity.Airport;
import cn.walls1717.sub.service.AirportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

/**
 * 机场接口
 */
@Tag(name = "机场接口")
@RestController
@RequiredArgsConstructor
@RequestMapping("airport")
public class AirportController {

	private final AirportService airportService;

	@Operation(summary = "保存")
	@PostMapping
	public void saveAirport(@RequestBody AirportSaveDTO airportSaveDTO) {
		airportService.saveAirport(airportSaveDTO);
	}

	@Operation(summary = "列表展示")
	@GetMapping
	public List<Airport> list() {
		return airportService.list();
	}
}
