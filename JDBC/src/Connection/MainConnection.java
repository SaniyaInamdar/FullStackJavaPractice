package Connection;

import java.util.Scanner;

public class MainConnection {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connectivity c=new Connectivity();
		int choice;
		//c.DbConnection();
//		c.createTable();
	
		
		do {
		System.out.println("1. Create");
		System.out.println("2. Insert ");
		System.out.println("3. Show ");
		System.out.println("4. Delete ");
		System.out.println("Enter Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: c.createTable(); 	break;
		case 2 : c.insertTable(); 	break;
		case 3 : c.showTable(); 	break;
		case 4 : c.deleteTable();	break;
		case 5 : c.updateTable(); 	break;
		case 6 : System.out.println("Terminated Program Sucessfully"); break;
		default : System.out.println("Wrong Choice");
		}
		}while(choice!=6);
		
	}

}
