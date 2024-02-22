package assignment1;

//Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
public class Q1 {

	public static void main(String[] args) {
		float f = 9.6f;
		double d = 9.3;
		int a = 23;
		System.out.println("\t\t\t demonstrate compatible type conversions");
		int ans1 = (int) f;
		System.out.println("float to int -" + ans1);
		float ans2 = (float) d;
		System.out.println("double to float -" + ans2);
		short ans3 = (short) a;
		System.out.println("int to short -" + ans3);

	}

}
