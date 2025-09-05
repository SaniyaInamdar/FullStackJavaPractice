package library;

import java.util.Scanner;

//4️⃣ Main Class: MainLibrary
//
//Accept multiple student details using Scanner
//
//Accept book details
//
//Accept library details
//
//Print everything in structured format


public class MainLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			
			Book b=new Book();
			
			b.accept();
			b.show();
		
			
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("How many student you want to add : ");
			int student=sc.nextInt();
			
			
			for(int i=1;i<=student;i++) {
				Student st=new Student();
				st.acceptStudent();
				if(st.getstudentAge()<18) {
					System.out.println("Sorry you cant enrolled");
				}
				else {
					st.showStudent();
				}
				
			}
			
		
	}

}
