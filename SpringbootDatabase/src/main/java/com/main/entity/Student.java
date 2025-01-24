package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
    private int Sid;
	private String Sname;
	private String city;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, String city) {
		super();
		Sid = sid;
		Sname = sname;
		this.city = city;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", city=" + city + "]";
	}
	
	
}
