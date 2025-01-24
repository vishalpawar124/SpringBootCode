package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.EmployeDao;
import com.main.entity.Employe;

@Service
public class EmployeService {
	@Autowired
	EmployeDao dao;
	public String insertdata(Employe e) {
		String msg=dao.insertdata(e);
		return msg;
	}
}
