package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class ShopLocationMany {

		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO)
		int locId;
		String location;
	    @OneToMany(mappedBy = "shopLocation") @Cascade(CascadeType.ALL)
	    private List<MobileOne> mobiles = new ArrayList<>();
		@Override  
		public String toString() {
			return "ShopLocationMany [locId=" + locId + ", location=" + location + "]";
		}
		
		
		public ShopLocationMany(String location) {
			super();
			this.location = location;
		}
		public ShopLocationMany() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getLocId() {
			return locId;
		}
		public void setLocId(int locId) {
			this.locId = locId;
		}


		public List<MobileOne> getMobiles() {
			return mobiles;
		}


		public void setMobiles(List<MobileOne> mobiles) {
			this.mobiles = mobiles;
		}
		
		
}
