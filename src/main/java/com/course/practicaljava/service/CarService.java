package com.course.practicaljava.service;

import java.util.List;

import com.course.practicaljava.entity.Car;

public interface CarService {
	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "B lack", "White");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV");
	
	List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media Player", "Leather Seats");
	List<String> FUELS = List.of ("Gas", "Electric", "Hybrid");
	List<String> TIRE_MANUFACTURERS = List.of( "Goodyear", "BridgeStone", "Dunlop");
	

	Car generateCar();

}
