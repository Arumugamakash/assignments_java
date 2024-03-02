package Assignment6;

import java.util.Scanner;

//Create a program to count vowels in a given string using string functions
public class Q1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The String");
		String s = sc.next();
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("count vowels " + count);
	}
}
