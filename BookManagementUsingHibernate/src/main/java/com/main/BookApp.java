package com.main;

import java.util.Scanner;
import com.dao.BookDao;
import com.entity.Book;

public class BookApp {

	public static void main(String[] args) {
		BookDao bd = new BookDao();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter Your Choice : ");
			System.out.println("1.Insert 2.Update 3.Delete 4.Show 0.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				Book b1 = new Book();
				System.out.println("Enter Title");
				b1.setTitle(sc.next());
				System.out.println("Enter Author");
				b1.setAuthor(sc.next());
				System.out.println("Enter Published Year");
				b1.setPublishedYear(sc.nextInt());
				System.out.println("Enter Price");
				b1.setPrice(sc.nextDouble());
				bd.addBook(b1);
				System.out.println("Book saved..");
				break;
				
			case 2: 
				System.out.println("Enter Book ID to update: ");
				int idToUpdate = sc.nextInt();
				Book bookToUpdate = bd.getBookById(idToUpdate);
				
				if (bookToUpdate != null) {
					System.out.println("Enter New Title");
					bookToUpdate.setTitle(sc.next());
					System.out.println("Enter New Author");
					bookToUpdate.setAuthor(sc.next());
					System.out.println("Enter New Published Year");
					bookToUpdate.setPublishedYear(sc.nextInt());
					System.out.println("Enter New Price");
					bookToUpdate.setPrice(sc.nextDouble());
					
					bd.update(bookToUpdate);
					System.out.println("Book Updated..");
				} else {
					System.out.println("Book not found!");
				}
				break;
				
			case 3: 
				System.out.println("Enter Book ID to delete: ");
				int idToDelete = sc.nextInt();
				Book bookToDelete = bd.getBookById(idToDelete);
				
				if (bookToDelete != null) {
					bd.delete(bookToDelete);
					System.out.println("Book Deleted..");
				} else {
					System.out.println("Book not found!");
				}
				break;
				
			case 4: 
				bd.showall();
				break;
				
			default : System.out.println("Wrong Choice...");
			}
		} while(choice != 0);
		
		sc.close();
	}
}
