package basics;

import java.util.Scanner;

public class ConditionalStatenent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(num>=18) {
			System.out.println("You are eligible");
		}
		else if(num<=18) {
			System.out.println("You are not elegible");
		}
		if(num==17) {
			System.out.println(17);
		}
		else {
			System.out.println("Wrong number");
		}
	}
}
