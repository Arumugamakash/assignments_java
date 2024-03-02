package Assignment6;

import java.util.Scanner;

//Write a program to reverse the words in a sentence.
public class Q3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The String");
		String s = sc.nextLine();//sa na dg;
		String sp[]=s.split(" ");
		String ans="";
		for (int i = sp.length-1; i >=0 ; i--) {
			ans+=sp[i]+" ";
		}
		System.out.println("OUTPUT"+ans);
	}

}
