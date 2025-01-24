package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.PhoneDao;
import com.main.entity.Phone;

@Service
public class PhoneService {
	@Autowired
	PhoneDao dao;
	public String InsertData(Phone p) {
		String msg=dao.Insertdata(p);
		return msg;
	}
}
