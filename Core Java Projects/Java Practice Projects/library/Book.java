package library;

import java.util.Scanner;

//Variables: bookId, bookName, author, price

public class Book extends Library{
		private int bookid;
		private double price;
		private String bookname,author;
		
		
		public Book() {
			
		}
		
		public Book(int bookid,double price,String bookname,String Author) {
			setAuthor(Author);
			setBookid(bookid);
			setBookname(bookname);
			setPrice(price);
		}
		
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		@Override
		public void accept() {
			super.accept();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter book id : ");
			setBookid(sc.nextInt());
			
			System.out.println("Enter book name : ");
			setBookname(sc.next());
			
			System.out.println("Enter book author : ");
			setAuthor(sc.next());
			
			System.out.println("Enter book  price : ");
			setPrice(sc.nextDouble());
		}
		
		@Override
		public void show() {
			super.show();
			System.out.println("Enter book id : "+getBookid());
	
			System.out.println("Enter book name : "+getBookname());
	
			System.out.println("Enter book author : "+getAuthor());
		
			System.out.println("Enter book  price : "+getPrice());

		}
}
