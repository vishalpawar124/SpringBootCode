package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Student;
import com.main.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@PostMapping("/studinsert")
	public String insertdata(@RequestBody Student s) {
		String msg=service.insertData(s);
		return msg;
	}
}
