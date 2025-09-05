package basics;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 23;
		short s = 14;
		int b1 = (int) s;
		short s1 = (short) b;
		byte b2 = (byte) s;

		System.out.println(s);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(b2);

		char c = 'a';
		System.out.println(c);
		int char1 = (int) c;
		System.out.println(char1); // get ascii value

		// type promotion
		byte a = 20;
		byte b5 = 30;
		int mult = a * b5;
		System.out.println(mult);
	}

}
