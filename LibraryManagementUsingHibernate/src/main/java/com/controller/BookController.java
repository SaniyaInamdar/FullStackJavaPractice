package com.controller;

import java.util.Scanner;

import com.dao.BookDao;
import com.entity.Book;

public class BookController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		BookDao book=new BookDao();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter a choice : ");
			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Show All");
			System.out.println("4.Delete");
			System.out.println("5.Show by id");
			System.out.println("6.Save into file");
			System.out.println("0.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter title : ");
				b.setTitle(sc.next());
				System.out.println("Enter Author : ");
				b.setAuthor(sc.next());
				System.out.println("Enter Price");
				b.setPrice(sc.nextDouble());
				book.addBook(b);
				System.out.println("Book added..");
				break;
				
			case 2:				
				System.out.println("Enter id to update : ");
				int updateId=sc.nextInt();
				b.setId(updateId);
				System.out.println("Enter title : ");
				b.setTitle(sc.next());
				System.out.println("Enter Author : ");
				b.setAuthor(sc.next());
				System.out.println("Enter Price");
				b.setPrice(sc.nextDouble());
				book.updateBook(b,updateId);
				System.out.println("Book updated..");
				break;
				
			case 3:
				book.showAllBook();
				break;
				
			case 4:
				System.out.println("Enter deleted id : ");
				int deletedId=sc.nextInt();
				book.deleteBook(deletedId);
				System.out.println("Book deletd...");
				break;
				
			case 5:
				System.out.println("Enter id to show :");
				int showId=sc.nextInt();
				book.showOneBook(showId);
				break;
			
			case 6: 
				book.saveIntoFile();
				break;
				
			case 0:System.out.println("Thanks..");	break;
			
			default : System.out.println("Wrong choice..");
			}
		}while(choice!=0);
		sc.close();
	}

}
