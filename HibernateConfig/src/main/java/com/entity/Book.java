package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookid;
	private String bookname;
	private String authorname;
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}
	
	public Book(int bookid) {
		this.bookid=bookid;
	}
	
	public Book(int bookid, String bookname, String authorname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
}
