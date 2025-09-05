package bankingsystem;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in);
	private long accountno ;
	private String accountholdername,accounttype;
	
	public void setaccountno(long accountno) {
		this.accountno=accountno;
	}
	public long getaccountno() {
		return accountno;
	}
	
	public void setaccountholdername(String accountholdername) {
		this.accountholdername=accountholdername;
	}
	public String getaccountholdername() {
		return accountholdername;
	}
	
	public void setaccounttype(String accounttype) {
		this.accounttype=accounttype;
	}
	public String getaccounttype() {
		return accounttype;
	}
	
	
	public void addbankaccount() {
		
		
		System.out.println("Enter Account No");
		setaccountno(sc.nextLong());
		System.out.println("Enter Account holder name");
		setaccountholdername(sc.next());
		System.out.println("Enter Account type");
		setaccounttype(sc.next());
	}
	
	
	public void showbankaccount() {
		System.out.println("Account No : "+getaccountno());
		System.out.println("Account holder name : "+getaccountholdername());
		System.out.println("Account Type : "+getaccounttype());
		
	}
	
	
	

}
