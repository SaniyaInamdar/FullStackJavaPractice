package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobileDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int md_id;
	int ram;
	@Override
	public String toString() {
		return "MobileDetails [md_id=" + md_id + ", ram=" + ram + "]";
	}
	public MobileDetails(int ram) {
		super();
		this.ram = ram;
	}
	public MobileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
