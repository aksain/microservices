package com.aksain.boot.metrics.es.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test/{id}")
	public String getTestMessage(@PathVariable("id") long id) {
		return "Message: " + id;
	}
}
