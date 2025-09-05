package arrayAndString;

public class StringEx {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="Saniya";
		System.out.println(s.hashCode());
		s="Inamdar";
		System.out.println(s.hashCode());
		
		System.out.println(s);
		System.out.println(s+"saniya");
		
		  String s1="Saniya";
		  String s2="Saniya";
		  System.out.println(s1==s2);
		  System.out.println(s1.equals(s2));
		  
		  String s3=new String("Saniya");
		  String s4=new String("Saniya");
		  System.out.println(s3==s4);
		  System.out.println(s3.equals(s4));
		  
		  StringBuffer sb=new StringBuffer("Saniya");
		  StringBuilder sb2=new StringBuilder("Saniya");
		  System.out.println(sb.equals(sb2));
	} 
}
 