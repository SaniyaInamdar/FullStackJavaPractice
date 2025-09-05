package classAndObject;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int add=c.add(4, 5);
		System.out.println(add);
	}
}

class Calculator {
	public int add(int a, int b) {
		int r=a+b;
		return r; 
	} 
}


	