package assignment13;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input
public class Qn3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PhoneNumber");
		try {
			long phNo = sc.nextLong();
			System.out.println(phNo);
		} catch (InputMismatchException e) {
			System.out.println("Input Miss Match");
		}
	}
}