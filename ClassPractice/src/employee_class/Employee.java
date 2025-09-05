package employee_class;

import java.util.Scanner;

//- create a class Employee 
//- it is sub class of Person
//- define properties - id,salary,department,post
//- used encapsulation 
//- define non-parameterized constructor 
//- define parameterized constructor 
//- define a method to accept properties 
//- define a method to show properties
//- override accept and show method of Person class 
//- override toString() method in both class 
//- create array in employee class - insert employee class object into array immediately when object is created 
//- override accept and show method of Person class 
//- override toString() method in both class 
//- create array in employee class - insert employee class object into array immediately when object is created 



public class Employee extends Person{
	private int id;
	private String department,post;
	private double salary;
	public static Employee e[]=new Employee[3];
	public static int count=0;
	
	public Employee() {
		if(count < e.length) {
			e[count]=this;
			count++;
		}
	}
	public Employee(int id,String department,String post,double salary) {
		this.id=id;
		this.salary=salary;
		this.post=post;
		this.salary=salary;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	public String getdepartment() {
		return department;
	}
	
	public void setpost(String post) {
		this.post=post;
	}
	public String getpost() {
		return post;
	}
	
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
	}
	
	@Override
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		setid(sc.nextInt());
		System.out.println("Enter department : ");
		setdepartment(sc.next());
		System.out.println("Enter a Post : ");
		setpost(sc.next());
		System.out.println("Enter Salary : ");
		setsalary(sc.nextDouble());
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Id : "+ getid());
		System.out.println("Department : "+getdepartment());
		System.out.println("Post : "+getpost());
		System.out.println("Salary : "+getsalary());
	}
	
	@Override
	public String toString() {
		super.toString();
		return "["+"Employee : "+ getid() + " "+ getdepartment() + " "+ getpost() + " "+ getsalary()+" "+"]";
	}
	
	
}
