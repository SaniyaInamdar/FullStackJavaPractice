package shape;

import java.util.Scanner;

public class Circle implements Shape{
	private float radius;
	double area;
	public Circle() {
		
	}
	
	public Circle(float radius) {
		setradius(radius);
	}
	
	
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(area);
	}
	
	public float getradius() {
		return radius;
	}


	public void setradius(float radius) {
		this.radius = radius;
	}


	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Circle---------");
		
		System.out.println("Enter Radius : ");
		setradius(sc.nextFloat());
		
	}
	
	public void show() {
		area=3.14*(getradius()*getradius());
	}

}