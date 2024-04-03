package assignment13;

//Write a program for division with proper divide-by-zero exception handling
public class Qn1 {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Any value Cannot Divied by zero");
		}
	}
}
