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
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("airport")
public class AirportController {

	private final AirportService airportService;

	@PostMapping
	public void saveAirport(@RequestBody AirportSaveDTO airportSaveDTO) {
		airportService.saveAirport(airportSaveDTO);
	}

	@GetMapping
	public List<Airport> list() {
		return airportService.list();
	}
}
