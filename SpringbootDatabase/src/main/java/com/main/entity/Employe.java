package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {

	@Id
	private int Eid;
	private String Ename;
	private String Ecity;

	public Employe() {
		super();
	}

	public Employe(int eid, String ename, String ecity) {
		super();
		Eid = eid;
		Ename = ename;
		Ecity = ecity;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEcity() {
		return Ecity;
	}

	public void setEcity(String ecity) {
		Ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employe [Eid=" + Eid + ", Ename=" + Ename + ", Ecity=" + Ecity + "]";
	}
	

}
