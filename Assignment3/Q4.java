package Assignment3;

import java.util.Scanner;

//Write a program to print multiplication table of a given number in a neat format
public class Q4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num=sc.nextInt();//4
		for (int i = 1; i <=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
