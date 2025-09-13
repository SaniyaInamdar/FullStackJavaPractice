package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.entity.MobileOne;

import com.entity.ShopLocationMany;

public class MobileOneToManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration()
				.configure()
				.addAnnotatedClass(MobileOne.class)
				.addAnnotatedClass(ShopLocationMany.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		
		ShopLocationMany shop1=new ShopLocationMany("Pune");
		ShopLocationMany shop2=new ShopLocationMany("Mubai");
		
		
		MobileOne mobile1=new MobileOne("Samsung");
		MobileOne mobile2=new MobileOne("Oppo");
		MobileOne mobile3=new MobileOne("Realme");
		MobileOne mobile4=new MobileOne("Apple");
		
		
		mobile1.setShopLocation(shop1);
		mobile2.setShopLocation(shop2);
		shop1.getMobiles().add(mobile1);
		shop1.getMobiles().add(mobile3);
		
		
		mobile3.setShopLocation(shop1);
		mobile4.setShopLocation(shop2);
		shop1.getMobiles().add(mobile2);
		shop1.getMobiles().add(mobile4);
		
		
		
		session.save(shop1);
		session.save(shop2);
		
		session.beginTransaction().commit();
	
	}

}
