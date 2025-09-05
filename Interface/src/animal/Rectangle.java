package animal;

import java.util.Scanner;

public class Rectangle implements Animal {
	private double length,breadth;
	double area;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(this.area);
	}
	
	public void setlength(double length) {
		this.length=length;
	}
	public double getlength() {
		return length;
	}
	public void setbreadth(double breadth) {
		this.breadth=breadth;
	}
	public double getbreadth() {
		return breadth;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----Rectangle-----");
		
		System.out.println("Enter length : ");
		setlength(sc.nextDouble());
		System.out.println("Enter Breadth : ");
		setbreadth(sc.nextDouble());
	}
	
	public void show() {
		area=getlength()*getbreadth();
	}

}
