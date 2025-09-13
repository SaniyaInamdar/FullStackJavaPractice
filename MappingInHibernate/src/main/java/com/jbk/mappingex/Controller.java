package com.jbk.mappingex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // Create Mobile
        Mobile mobile = new Mobile("Apple");

        // Create ShopLocations
        ShopLocation s1 = new ShopLocation("Mumbai");
        ShopLocation s2 = new ShopLocation("Pune");
        ShopLocation s3 = new ShopLocation("Delhi");

        // Add to Mobile
        mobile.addShopLocation(s1);
        mobile.addShopLocation(s2);
        mobile.addShopLocation(s3);

        // Save only parent (cascade will save children)
        session.save(mobile);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data inserted successfully!");
    }
}
