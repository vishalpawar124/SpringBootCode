package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phone {
	@Id
	private int Pid;
	private String Pname;
	private String Ptype;

	public Phone() {
		super();
	}

	public Phone(int pid, String pname, String ptype) {
		super();
		Pid = pid;
		Pname = pname;
		Ptype = ptype;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPtype() {
		return Ptype;
	}

	public void setPtype(String ptype) {
		Ptype = ptype;
	}

	@Override
	public String toString() {
		return "Phone [Pid=" + Pid + ", Pname=" + Pname + ", Ptype=" + Ptype + "]";
	}

}
