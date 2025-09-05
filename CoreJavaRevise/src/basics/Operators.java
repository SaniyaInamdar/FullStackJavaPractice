package basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15, b = 5;
		boolean c = true;

		// Arithmetic operator
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // quotient
		System.out.println(a % b); // reminder

		// Relational Operator
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);

		// Logical Operator
		System.out.println(a > b && a < b);
		System.out.println(a == b || a > b);
		System.out.println(!c);

		// Assignment Operator
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);

		// Increment & Decrement
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);

		System.out.println(a > b ? "mango" : "apple");
	}

}
