package library;

import java.util.Scanner;

//Project Structure
//1️⃣ Class: Library
//
//Variables: libraryId, libraryName, location
//
//Methods: acceptLibraryDetails(), showLibraryDetails()
//
//2️⃣ Class: Book extends Library
//
//Variables: bookId, bookName, author, price
//
//Apply:
//
//Encapsulation
//
//Constructor overloading (default + parameterized)
//
//Method overriding: showLibraryDetails() overridden in Book
//
//3️⃣ Class: Student extends Book
//
//Variables: studentId, studentName, studentAge
//
//Apply:
//
//If age < 18, show "Not eligible to borrow books" (control statement)
//
//Use super() in constructor
//
//4️⃣ Main Class: MainLibrary
//
//Accept multiple student details using Scanner
//
//Accept book details
//
//Accept library details
//
//Print everything in structured format

public class Library {
	private int libraryId;
	private String libraryName, location;
	
	public Library() {
		
	}
	
	public Library(int libraryid,String libraryname, String location) {
		setlibraryId(libraryid);
		setlibraryName(libraryname);
		setlocation(location);
	}
	

	
	public void setlibraryId(int libraryId) {
		this.libraryId=libraryId;
	}
	public int getlibraryId() {
		return libraryId;
	}
	
	
	
	public void setlibraryName(String libraryName) {
		this.libraryName=libraryName;
	}
	public String getlibraryName() {
		return libraryName;
	}
	
	
	
	public void setlocation(String location) {
		this.location=location;
	}
	public String getlocation() {
		return location;
	}
	
	
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter libraryId : ");
		setlibraryId(sc.nextInt());
		
		System.out.println("Enter library name : ");
		setlibraryName(sc.next());
		
		System.out.println("Enter library location :  ");
		setlocation(sc.next());
	}
	
	
	public void show()  {
		System.out.println("Library Id : "+getlibraryId());
		System.out.println("Library Name : "+getlibraryName());
		System.out.println("Library location : "+getlocation());
	}

}
