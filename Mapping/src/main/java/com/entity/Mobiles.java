package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Mobiles {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int m_id;
	String m_name;
	@OneToOne @Cascade(CascadeType.ALL) @JoinColumn(name="md_id")
	MobileDetails details;
	public Mobiles(String m_name, MobileDetails details) {
		super();
		this.m_name = m_name;
		this.details = details;
	}
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobiles [m_id=" + m_id + ", m_name=" + m_name + ", details=" + details + "]";
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public MobileDetails getDetails() {
		return details;
	}
	public void setDetails(MobileDetails details) {
		this.details = details;
	}
	
	
	
}
