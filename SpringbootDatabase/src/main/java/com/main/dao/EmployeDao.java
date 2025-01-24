package com.main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.entity.Employe;

@Repository
public class EmployeDao {
	@Autowired
	SessionFactory factory; 
	public String insertdata(Employe e) {
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		s.persist(e);
		s.close();
		tr.commit();
		return"DATA IS INSEERTED...";
	}
}
