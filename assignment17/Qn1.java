package assignment17;

import java.util.Scanner;
import java.util.Stack;

/*1. Write a java program that takes a string of parentheses ((, ), [, ], {, and }) and 
checks if it is balanced.*/
public class Qn1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the parentheses");
		String input = sc.nextLine();// ({[]});
		System.out.println(validParanthesis(input));
	}

	private static boolean validParanthesis(String input) {
		boolean b = true;
		Stack<Character> parentheses = new Stack<Character>();
		if (input.length() % 2 != 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				parentheses.push(input.charAt(i));
			} else {
				char check = 0;
				switch (input.charAt(i)) {
				case ')':
					check = '(';
					break;
				case '}':
					check = '{';
					break;
				case ']':
					check = '[';
					break;
				default:
					break;
				}
				if (check != parentheses.pop()) {
					b = false;
				}
			}

		}
		return b;
	}
}