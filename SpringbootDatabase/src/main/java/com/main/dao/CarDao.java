package com.main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.entity.Car;

@Repository
public class CarDao {
	@Autowired
	SessionFactory factroy;
	public String Insertdata(Car c) {
		Session ss=factroy.openSession(); 
		Transaction tr=ss.beginTransaction();
		ss.persist(c);
		ss.close();
		tr.commit();
		return "car data inserted...";
	}
}
