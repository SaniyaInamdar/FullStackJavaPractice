//1️⃣ Student Class
//Variables: studentId, name, age, city
//Use encapsulation (private variables + getter/setter methods)

//2️⃣ Course Class (Inheritance Example)
//Parent Class: Course → courseId, courseName
//Child Class: Student → inherits course details + student details

//3️⃣ Main Functionality
//Accept multiple student details using Scanner
//Accept course details
//Display all student and course information
//Apply control statements:
//If student age < 18 → show "Not eligible for admission"
//Else → show "Admission Successful"

//4️⃣ Bonus Practice
//Create different constructors:
//Default Constructor
//Parameterized Constructor
//Use this and super keywords for constructor chaining
package student;

import java.util.Scanner;

public class Student extends Course {
	private int studentId,age;
	private String name,city;
	int totalstudent;
	
	public Student() {
		acceptstudent();
		showstudent();
	}
	
	public Student(int studentId,int age,String name,String city) {
		setstudentId(studentId);
		setage(age);
		setname(name);
		setcity(city);
	}
	
	
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public int getstudentid() {
		return studentId;
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
	
	public void acceptstudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details :");
	
	
			System.out.println("Enter Student");
			System.out.println(" ");
			
			System.out.println("Enter Student ID : ");
			setstudentId(sc.nextInt());
			
			System.out.println("Enter Student Age : ");
			setage(sc.nextInt());
			
			System.out.println("Enter Student Name : ");
			setname(sc.next());
			
			System.out.println("Enter Student City : ");
			setcity(sc.next());
			
			System.out.println("Done");
			super.acceptcourse();
		}
	
	public void showstudent() {
		System.out.println("Student ID : "+getstudentid());
		System.out.println("Student Age : "+getage());
		System.out.println("student Name : "+getname());
		System.out.println("student City : "+getcity());
		super.showcourse();
	}
}
