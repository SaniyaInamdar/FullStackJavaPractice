package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.MobileDetails;
import com.entity.Mobiles;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration()
				.configure()
				.addAnnotatedClass(Mobiles.class)
				.addAnnotatedClass(MobileDetails.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		MobileDetails md=new MobileDetails(8);
		session.save(md);
		session.beginTransaction().commit();
		Mobiles m=new Mobiles("Samsung",md);
		session.save(m);
		session.beginTransaction().commit();
		System.out.println("Data saved..");
	}
}
