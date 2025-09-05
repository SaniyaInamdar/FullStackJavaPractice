package shape;

import java.util.Scanner;

public class Rectangle implements Shape{
	private float length;
	private float breadth;
	double area;
	public Rectangle() {
		
	}
	
	public Rectangle(float length,float breadth) {
		setlength(length);
		setbreadth(breadth);
	}
	
	
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(area);
	}
	
	public float getlength() {
		return length;
	}


	public void setlength(float length) {
		this.length = length;
	}


	public float getbreadth() {
		return breadth;
	}


	public void setbreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Rectangle---------");
		
		System.out.println("Enter Length : ");
		setlength(sc.nextFloat());
		System.out.println("Enter Breadth : ");
		setbreadth(sc.nextFloat());
		
	}
	
	public void show() {
		area=getlength()*getbreadth();
	}

}