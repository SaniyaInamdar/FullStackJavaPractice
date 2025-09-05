package com.service;


import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Song;

public class SongDao {

	public Session s=getSession();
	
	Session getSession() {
		Configuration cfg=new  Configuration().configure().addAnnotatedClass(Song.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
	}
	
	public void add(Song song) {
		s.save(song);
		s.beginTransaction().commit();
		System.out.println("Song added...");
	}
	
	public void delete(Song song) {
		s.delete(song);
		s.beginTransaction().commit();
	}
	
	public void show() {
		Criteria criteria=s.createCriteria(Song.class);
		List<Song> song=criteria.list();
		for(Song s:song) {
			System.out.println(s);
		}
	}
	
	public void update() {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter an id :");
		int id=sc.nextInt();
		Song song=s.load(Song.class, id);
		System.out.print("Enter new Song Name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new Singer Name: ");
        String newSinger = sc.nextLine();
        song.setName(newName);
        song.setSinger(newSinger);
        s.update(song);
        s.beginTransaction().commit();
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * Song song=new Song("hum tere bina", "saniya"); song.setId(1);
		 * s.saveOrUpdate(song); s.beginTransaction().commit();
		 * System.out.println("Song saved...");
		 * 
		 * Song songshow=session.load(Song.class, 1); System.out.println(songshow);
		 * 
		 * Criteria criteria=session.createCriteria(Song.class);
		 * criteria.setProjection(Projections.projectionList().add(Projections.property(
		 * "name")).add(Projections.property("singer"))); List<Object[]>
		 * list=criteria.list(); for(Object[] data:list) {
		 * System.out.println("Song name : "+data[0]+" Singer name : "+data[1]); }
		 */
		/*
		 * List<String> list=criteria.list(); for(String data:list) {
		 * System.out.println(data); }
		 */
	}
}
