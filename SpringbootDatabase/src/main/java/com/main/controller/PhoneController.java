package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Phone;
import com.main.service.PhoneService;

@RestController
public class PhoneController {
	@Autowired
	PhoneService service;
	@PostMapping("/phoneinsert")
	public String InsertData(@RequestBody Phone p) {
		String msg=service.InsertData(p);
		return msg;
	}
	
}
