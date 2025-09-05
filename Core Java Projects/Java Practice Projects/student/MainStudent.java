package student;

import java.util.Scanner;

//
//import java.util.Scanner;

public class MainStudent {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("How many student you want to enter : ");
		int totalstudent=sc.nextInt();
		
		for(int i=1;i<=totalstudent;i++) {
			Student st=new Student();
		if(st.getage()<18) {
			System.out.println("Student not eligible");
			continue;
		}
		else {
			System.out.println("Admission succefully");
		}
	}
		
		sc.close();
	}

}
