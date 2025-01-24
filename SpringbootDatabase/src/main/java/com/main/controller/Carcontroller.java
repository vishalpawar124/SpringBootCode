package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Car;
import com.main.service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Carcontroller {
	@Autowired
	CarService service;
	@PostMapping("/carinsert")
	public String Insertdata(@RequestBody Car c ) {
		String msg=service.Insertdata(c);
		return msg;
	}
	
}
