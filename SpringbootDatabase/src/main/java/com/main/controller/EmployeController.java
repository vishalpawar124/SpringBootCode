package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Employe;
import com.main.service.EmployeService;

@RestController
public class EmployeController {
	@Autowired
	EmployeService service;
	@PostMapping("/empinsert")
	public String insertdata(@RequestBody Employe e) {
		String msg=service.insertdata(e);
		return msg;
	}
	
}
