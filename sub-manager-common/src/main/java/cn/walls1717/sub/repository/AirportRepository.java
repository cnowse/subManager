package cn.walls1717.sub.repository;

import cn.walls1717.sub.pojo.entity.Airport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends JpaRepository<Airport, Long>, CrudRepository<Airport, Long> {
}