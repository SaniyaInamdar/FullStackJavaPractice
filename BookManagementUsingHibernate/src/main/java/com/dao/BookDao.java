package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;

public class BookDao {
	
	public Session getSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	
	public void addBook(Book book) {
		Session s = getSession();
		s.beginTransaction();
		s.save(book);
		s.getTransaction().commit();
		s.close();
	}
	
	// ✅ Fetch by ID
	public Book getBookById(int id) {
		Session s = getSession();
		Book book = s.get(Book.class, id);
		s.close();
		return book;
	}
	
	public void delete(Book book) {
		Session s = getSession();
		s.beginTransaction();
		s.delete(book);
		s.getTransaction().commit();
		s.close();
	}
	
	public void showall() {
		Session s = getSession();
		Criteria criteria = s.createCriteria(Book.class);
		List<Book> books = criteria.list();
		for (Book b : books) {
			System.out.println(b);
		}
		s.close();
	}
	
	public void update(Book book) {
		Session s = getSession();
		s.beginTransaction();
		s.update(book);
		s.getTransaction().commit();
		s.close();
	}
}
