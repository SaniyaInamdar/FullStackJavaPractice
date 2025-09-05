package student_class;

import java.util.Scanner;

public class Student {
	private String name,city;
	private int age;
	int arr[]=new int[2];
	public Student() {
		
	}
	
	public Student(String name,String city, int age) {
		this.name=name;
		this.city=city;
		this.age=age;
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
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name :");
		setname(sc.next());
		System.out.println("Enter a city :");
		setcity(sc.next());
		System.out.println("Enter an age :");
		setage(sc.nextInt());
	}
	
	public void show() {
		System.out.println("Name is : "+getname());
		System.out.println("City is  : "+getcity());
		System.out.println("Age is  : "+getage());
	}
	
	public void studentarray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter"+" " + i +" "+"Student details : ");
			this.accept();
		}
	}
	
	public void showarrayint (int s[]) {
		for(int j=0;j<s.length;j++) {
			System.out.println(j+" "+"Student : ");
			this.show();
		}
	}
	
	public void sortge(Student[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j>arr.length;j++) {
				if (arr[i].getage() < arr[j].getage()) {
					Student k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
	}
	
}
