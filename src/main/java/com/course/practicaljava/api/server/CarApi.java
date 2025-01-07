package com.course.practicaljava.api.server;

import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.practicaljava.entity.Car;
import com.course.practicaljava.service.CarService;

@RequestMapping( "/api/car/v1")
@RestController
public class CarApi {
	@Autowired
	private CarService carService;
	private static final Logger LOG = LoggerFactory.getLogger(CarApi.class);
	
	@GetMapping( value="/random", produces = MediaType.APPLICATION_JSON_VALUE )
	public Car random() {
		return carService.generateCar();
	}
	
	@PostMapping( value ="/echo", consumes = MediaType.APPLICATION_JSON_VALUE)	
	public String echo( @RequestBody Car car ) {
		LOG.info("Car is : " + car);
		return car.toString();
	}

	@PostMapping( value = "/random-collection", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> randomCarArray() {
		var result = new ArrayList<Car>();
		
		for ( int i =0; i < ThreadLocalRandom.current().nextInt(1,6); i++ ) {
			result.add(carService.generateCar());
		}
		
		return result;
	}
}
