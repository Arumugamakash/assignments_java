package Assignment6;

import java.util.Scanner;

// Write a program to reverse the characters of a string.
public class Q2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The String");
		String s = sc.next();
		String ans="";
		for (int i = s.length()-1; i >=0; i--) {
			ans+=s.charAt(i);
		}
		System.out.println("OUTPUT IS:"+ans);
	}
}
