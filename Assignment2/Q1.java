package Assignment2;

import java.util.Scanner;

//Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
public class Q1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Celsius");
		int celsius=sc.nextInt();
		double fahrenheit=(celsius*9/5)+32;
		System.out.println("Celsius of "+celsius+" fahrenheit is-"+fahrenheit);
	}

}
