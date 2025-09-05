package library;

import java.util.Scanner;

//Variables: studentId, studentName, studentAge


public class Student extends Library{
	private int studentId, studentAge;
	private String studentName;
	
	
	public Student() {
	
	}
	
	public Student(int studentId,String studentName,int studentAge) {
		setstudentId(studentId);
		setstudentName(studentName);
		setstudentAge(studentAge);
	}
	
	
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getstudentId() {
		return studentId;
	}
	
	public void setstudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentAge(int studentAge) {
		this.studentAge= studentAge;
	}
	public int getstudentAge() {
		return studentAge;
	}
	
	
	
	public void acceptStudent() {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id : ");
		setstudentId(sc.nextInt());
		System.out.println("enter Student Name");
		setstudentName(sc.next());
		System.out.println("enter Student Age");
		setstudentAge(sc.nextInt());
	}
	

	
	public void showStudent() {
		
		System.out.println(" Student Id : "+getstudentId());
	
		System.out.println("Student Name"+getstudentName());

		System.out.println("Student Age"+getstudentAge());
		
	}
	

}
