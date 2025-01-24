package com.main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.entity.Phone;

@Repository
public class PhoneDao {
	@Autowired
	SessionFactory factory;
	public String Insertdata(Phone p) {
		Session s= factory.openSession();
		Transaction tr=s.beginTransaction();
		s.persist(p);
		s.close();
		tr.commit();
		return "Phone data is inserted......";
	}
}
