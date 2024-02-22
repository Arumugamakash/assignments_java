package assignment1;

//Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
import java.util.Scanner;

public class Q2 {
	enum day {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the nth number of weekday");
		int n = sc.nextInt();
		System.out.println(day.values()[n - 1]);
	}

}
