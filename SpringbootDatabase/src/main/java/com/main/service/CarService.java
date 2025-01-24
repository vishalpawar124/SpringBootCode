package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.CarDao;
import com.main.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao dao;
	public String Insertdata(Car c) {
		String msg=dao.Insertdata(c);
		return msg;
	}
}
