package Assignment2;
//Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
import java.util.Scanner;

public class Q3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		System.out.println("Enter the Number");
		int b = sc.nextInt();

		System.out.println("Bitwise OR Operator:" + (a | b));
		System.out.println("Bitwise AND Operator:" + (a & b));
		System.out.println("BItwise NOT Operator:" + (~a));
		System.out.println("Bitwise XOR Operator:" + (a ^ b));
		System.out.println("Left Shift:"+ (a<<2));
		System.out.println("Right Shift:"+ (a>>2));

	}

}
