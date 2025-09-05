package animal;

import java.util.Scanner;

public class Circle implements Animal {
	private double radius;
	double area;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(this.area);
	}
	
	public void setradius(double radius) {
		this.radius=radius;
	}
	public double getradius() {
		return this.radius;
	}
	
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----Radius-----");
		
		System.out.println("Enter radius : ");
		this.setradius(sc.nextDouble());
		
	}
	
	public void show() {
		area=3.14*this.getradius()*this.getradius();
	}
}
