package com.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.dataModel;

@RestController
public class Controller {

	@PostMapping("/api/SpringBoot")
	public dataModel getResponse(@RequestBody dataModel model) {
		return model;
	}
}
