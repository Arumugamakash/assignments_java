package Assignment3;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number.
public class Q1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number 1");
		int a=sc.nextInt();//3
		System.out.println("Enter the Number 2");
		int b=sc.nextInt();//2
		System.out.println("Enter the Number 3");
		int c=sc.nextInt();//44
		int output=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest number of three is:"+output);
	}

}
