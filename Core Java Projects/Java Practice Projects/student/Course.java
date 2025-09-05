package student;

import java.util.Scanner;

public class Course {
	private int courseid;
	private String coursename;
	int totalcourse=2;
	
	public Course() {
		
	}
	
	public Course(int courseid,String coursename) {
		setcourseid(courseid);
		setcoursename(coursename);
	}
	
	public void setcourseid(int courseid) {
		this.courseid=courseid;
	}
	
	public int getcourseid() {
		return courseid;
	}
	
	public void setcoursename(String coursename) {
		this.coursename=coursename;
	}
	
	public String getcoursename() {
		return coursename;
	}
	
	public void acceptcourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course : ");
		
		System.out.println("Enter Course id : ");
		setcourseid(sc.nextInt());
		
		System.out.println("Enter Course Name : ");
		setcoursename(sc.next());

	}
	
	public void showcourse() {
		System.out.println("Course id is : "+getcourseid());
		System.out.println("Course name is : "+getcoursename());
	}
}
