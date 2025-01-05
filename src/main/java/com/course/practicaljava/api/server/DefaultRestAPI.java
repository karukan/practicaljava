package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping( "/api")
public class DefaultRestAPI {

	@GetMapping("/welcome")
	public String welcome() {
		return "Swamiye Saranam Ayyappa";
	}
	
	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
