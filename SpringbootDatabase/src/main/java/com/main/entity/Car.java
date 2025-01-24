package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int Cid;
	private String Cname;

	public Car() {
		super();
	}

	public Car(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Car [Cid=" + Cid + ", Cname=" + Cname + "]";
	}

}
