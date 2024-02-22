package assignment1;

//Write a program to swap the two given numbers.​
import java.util.Scanner;

public class Q5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Element 1");
		int a = sc.nextInt();
		System.out.println("Enter the Element 2");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swapping of a is:" + a);
		System.out.println("Swapping of b is:" + b);
	}

}
