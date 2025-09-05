package bankingsystem;

import java.util.Scanner;

public class SavingAccount extends BankAccount implements Accounts{
	
	int num;
	double totalbal=0d,deposit,withdraw,interest;
	
	Scanner sc=new Scanner(System.in);
	
	public void deposit() {
		System.out.println("Enter Deposit Amount : "); 
		deposit=sc.nextDouble();
		this.totalbal=this.totalbal+deposit;
	}
	
	public void withdraw() {
		System.out.println("How much amount you want to withdraw : ");
		withdraw=sc.nextDouble();
		
		System.out.println(this.totalbal=this.totalbal-withdraw);
	}
	
	public void calculateinterest() {
		if(totalbal>5000) {
			interest = totalbal * (5.0 / 100);
			this.totalbal=interest+this.totalbal;
		}
	}
	
	public void viewbalance() {
		System.out.println("Total bal"+this.totalbal);
	}
	
	
}
