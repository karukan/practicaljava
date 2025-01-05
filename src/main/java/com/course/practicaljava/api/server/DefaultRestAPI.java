package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping( "/api")
public class DefaultRestAPI {

	private static final  Logger LOG = LoggerFactory.getLogger(DefaultRestAPI.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		LOG.info( "Swamiye Saranam Iyyappa");
		return "Swamiye Saranam Ayyappa";
	}
	
	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
