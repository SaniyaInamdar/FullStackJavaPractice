package employee_class;

import java.util.Scanner;

//1. create a class Person 
//- define properties - name,age,city;
//- used encapsulation 
//- define non-parameterized constructor 
//- define parameterized constructor 
//- define a method to accept properties 
//- define a method to show properties 

//public void accept(){
//Scanner code
//print("enter id");
//setId(sc.nextInt());
//}
//@Override
//public String toString(){
//return "Id -> "+getId()+" Salary-> "+this.getSalary();
//}
////- override toString() method in both class 
public class Person {
	private int age;
	private String name,city;
	
	public Person() {
		
	}
	public Person(int age,String name,String city) {
		this.age=age;
		this.name=name;
		this.city=city;
	}
	
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	public String getcity() {
		return city;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		setname(sc.next());
		System.out.println("Enter city : ");
		setcity(sc.next());
		System.out.println("Enter age : ");
		setage(sc.nextInt());
	}
	
	public void show() {
		System.out.println("Name : "+getname());
		System.out.println("City : "+getcity());
		System.out.println("Age : "+getage());
	}
	
	@Override
	public String toString() {
		return "["+"Person Details : " + " "+ this.getcity() + this.getname() + this.getage()+"]";
		
	}
}
