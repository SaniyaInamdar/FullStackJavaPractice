package basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int i = 1;

		// For loop
		for(int j=0;j<=num;j++) {
			System.out.println(j);
			if(j==5) {
				//	break;
				//continue;
			}
		}

		//While Loop 
		while (i <= num) {
			System.out.println(i);
			i++;
		}
		
		//do while
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
	}
}
