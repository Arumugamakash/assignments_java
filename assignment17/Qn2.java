package assignment17;

import java.util.Scanner;
import java.util.Stack;

/*2. Write a function that converts an infix expression (e.g., a + b * c) 
to postfix notation (e.g., a b c * +).*/
public class Qn2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Input");
		String function = sc.nextLine();// a/b-c+d*e-a*c
		System.out.println("Output is : " + convertPostfixNotation(function)); 
	}
 
	private static String convertPostfixNotation(String function) {
		String ans = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < function.length(); i++) {
			if (Character.isAlphabetic(function.charAt(i))) {
				ans += function.charAt(i);
			} else {
				if (stack.empty()) {
					stack.push(function.charAt(i));
				} else {
					if ((countValue(stack.peek()) >= countValue(function.charAt(i)))) {
						while (!stack.isEmpty()) {
							ans += stack.pop();
						}
						stack.push(function.charAt(i));
					} else {
						stack.push(function.charAt(i));
					}
				}

			}

		}
		while (!stack.isEmpty()) {
			ans += stack.pop();
		}
		return ans;
	}

	private static int countValue(char val) {
		switch (val) {
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '/':
			return 3;
		default:
			return 0;
		}
	}
}
