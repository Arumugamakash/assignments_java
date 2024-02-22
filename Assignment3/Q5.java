package Assignment3;

import java.util.Scanner;

//Write a program to print factorial of a given number using loop
public class Q5 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int fact=1;
		while(num>0) {
			fact*=num;
			num--;
		}
		System.out.println("Factorial Of "+temp+" is "+fact);
	}
	

}
