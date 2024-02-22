package Assignment3;

import java.util.Scanner;

//Write a Java program to find the number of days in a given month and year.
public class Q2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		System.out.println("Enter the Month in String format Like...'JAN'");
		String month = sc.next();
		switch (month) {
		case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC":
			System.out.println("31 Days");
			break;
		case "APR", "JUN", "SEP", "NOV":
			System.out.println("30 Days");
			break;

		case "FEB":
			if (isLeep(year)) {
				System.out.println("29 Days");
			} else {
				System.out.println("28 Days");
				;
			}
		}
	}

	public static boolean isLeep(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
