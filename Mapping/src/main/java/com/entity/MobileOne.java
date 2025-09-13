package com.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MobileOne {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int mobid;
	String mobname;
	   	@ManyToOne
	    @JoinColumn(name = "locId") 
	private ShopLocationMany shopLocation;
	   	
	   	
	public MobileOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileOne(String mobname) {
		super();
		this.mobname = mobname;
	}

	public int getMobid() {
		return mobid;
	}

	public void setMobid(int mobid) {
		this.mobid = mobid;
	}

	public String getMobname() {
		return mobname;
	}

	public void setMobname(String mobname) {
		this.mobname = mobname;
	}


	public ShopLocationMany getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(ShopLocationMany shopLocation) {
		this.shopLocation = shopLocation;
	}

	@Override
	public String toString() {
		return "MobileOne [mobid=" + mobid + ", mobname=" + mobname + "]";
	}
	
	
}
