package com.entity;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CRUD {
	
		
	Session getSession() {
		Configuration cfg=new Configuration().configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		return s;
	}
	
	public void load() {
		Session s=getSession();
		Book b=s.load(Book.class, 1);
		System.out.println(b);
	}
	public void add() {
		Session s=getSession();
		Book b=new Book(4,"qwe","rty");
		s.save(b);
		s.beginTransaction().commit();
		System.out.println("Data saved");
	}
	
	public void delete() {
		Session s=getSession();
		Book b=new Book(4);
		s.delete(b);
		s.beginTransaction().commit();
		System.out.println("deleted...");
	}
	
	public void show() {
		Session s=getSession();
		Criteria criteria=s.createCriteria(Book.class);
		List<Book> booklist=criteria.list();
		for(Book b:booklist) {
			System.out.println(b);
		}
	}
	
	public void update() {
		Session s=getSession();
		Book b=new Book(1,"Sufyan","Shaikh");
		s.update(b);
		s.beginTransaction().commit();
		System.out.println("Book updated...");
	}
	
	public void updatesave() {
		Session s=getSession();
		Book b=new Book(4,"s","i");
		s.saveOrUpdate(b);
		s.beginTransaction().commit();
		System.out.println("Update or saved..");
	}
	
	public void criteriacheck() {
		Session s=getSession();
		Criteria c=s.createCriteria(Book.class);
		c.add(Restrictions.eq("bookid", 2));
		List<Book> l=c.list();
		for(Book b:l) {
			System.out.println(b);
		}
	}
}