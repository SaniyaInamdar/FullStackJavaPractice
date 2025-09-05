package arrayAndString;

public class StudentArray {
	
	int rollno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArray s1=new StudentArray();
		s1.rollno=12;
		StudentArray s2=new StudentArray();
		s2.rollno=12;
		StudentArray s3=new StudentArray();
		s3.rollno=12;
		StudentArray s4=new StudentArray();
		s4.rollno=12;
		
		
		StudentArray s[]=new StudentArray[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].rollno);
		}
		
		for(StudentArray std:s) {
			System.out.println(std.rollno);
		}
	}

}
