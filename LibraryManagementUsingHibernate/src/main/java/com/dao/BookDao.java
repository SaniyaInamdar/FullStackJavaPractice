package com.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Book;

public class BookDao {
	
	 Session getSession() {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		System.out.println("Session created..");
		return session;
	}
	
	public void addBook(Book b) {
		Session s= getSession();
		s.save(b);
		s.beginTransaction().commit();
	}
	
	public void deleteBook(int id) {
		Session s=getSession();
		Book b=s.load(Book.class, id);
		s.remove(b);
		s.beginTransaction().commit();
	}
	
	public void updateBook(Book b,int id) {
		Session s=getSession();
		s.load(Book.class, id);
		s.update(b);
		s.beginTransaction().commit();
	}
	
	public void showOneBook(int id) {
		Session s=getSession();
		Book b=s.load(Book.class, id);
		System.out.println(b);
		s.beginTransaction().commit();
	}
	
	public void showAllBook() {
		Session s=getSession();
		@SuppressWarnings("deprecation")
		Criteria criteria=s.createCriteria(Book.class);
		@SuppressWarnings("unchecked")
		List<Book> booklist=criteria.list();
		for(Book b:booklist) {
			System.out.println(b);
		}
	}
	
	public void saveIntoFile() {
		String url="D:\\FullStackJavaPractoce\\LibraryManagementUsingHibernate\\SavedDataIntoFile\\bookdata";
		File file=new File(url);
		Session s=getSession();
		@SuppressWarnings("deprecation")
		Criteria criteria=s.createCriteria(Book.class);
		@SuppressWarnings("unchecked")
		List<Book> blist=criteria.list();
		
		try {
			file.createNewFile();
			FileWriter fw=new FileWriter(file,false);
			for(Book b:blist) {
				fw.write(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice()+ System.lineSeparator());	
			}
			fw.close();
			System.out.println("Book saved into file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
