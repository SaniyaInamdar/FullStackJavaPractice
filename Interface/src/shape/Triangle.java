package shape;

import java.util.Scanner;

public class Triangle implements Shape{
	private float base;
	private float height;
	double area;
	public Triangle() {
		
	}
	
	public Triangle(float base,float height) {
		setBase(base);
		setHeight(height);
	}
	
	
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		this.accept();
		this.show();
		System.out.println(area);
	}
	
	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--------Triangle---------");
		
		System.out.println("Enter Base : ");
		setBase(sc.nextFloat());
		System.out.println("Enter Hieght : ");
		setHeight(sc.nextFloat());
	}
	
	public void show() {
		area=0.5*getBase()*getHeight();
	}

}