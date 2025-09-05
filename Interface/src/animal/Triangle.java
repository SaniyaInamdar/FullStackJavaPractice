package animal;

import java.util.Scanner;

public class Triangle implements Animal {
	private double base,height;
	double area;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(this.area);
	}
	
	public void setbase(double base) {
		this.base=base;
	}
	public double getbase() {
		return this.base;
	}
	public void setheight(double height) {
		this.height=height;
	}
	public double getheight() {
		return this.height;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----Triangle-----");
		
		System.out.println("Enter base : ");
		this.setbase(sc.nextDouble());
		System.out.println("Enter Breadth : ");
		this.setheight(sc.nextDouble());
	}
	
	public void show() {
		area=this.getbase()*this.getheight();
	}

}
