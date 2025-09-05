package accessKeywords;

public class Statickeyword {
	static int num=100;
	int num1=100;
	static {
		
		System.out.println("I am static bloc execute only once for always");
		System.out.println(num);
	}
	
	public void example() {
		System.out.println(num);
	}
	
	public static void example1() {
		System.out.println(num);
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		num=200;
//		Statickeyword.example1();
//		example1();
//		System.out.println(num);
		Class.forName("accessKeywords.Statickeyword");
	}

}  
