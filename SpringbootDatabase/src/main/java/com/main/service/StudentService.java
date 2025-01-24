package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.StudentDao;
import com.main.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;
	public String insertData(Student s) {
		String msg=dao.insertData(s);
		return msg;
	}
}
