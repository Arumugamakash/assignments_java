package Assignment6;

import java.util.Scanner;

//Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
public class Q4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The Email");
		String s = sc.nextLine().toLowerCase();
		if ((s.length() >= 6)
				&& ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= '0' && s.charAt(0) <= '9'))
				&& emailVarified(s)) {
			System.out.println("Mail is valid");
		} else {
			System.out.println("Mail is InValid");
		}
	}

	public static boolean emailVarified(String s) {
		int count = 0;
		int countdot = 0;
		int c1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((!(s.charAt(i) >= 32 && s.charAt(i) <= 45)) || (!(s.charAt(i) >= 58 && s.charAt(i) <= 63))
					|| (!(s.charAt(i) >= 91 && s.charAt(i) <= 96)) || (!(s.charAt(i) >= 123 && s.charAt(i) <= 127))) {
				if (s.charAt(i) == 64) {// @
					count++;// 1
					if (count == 1)
						c1 = s.indexOf('@');
					if (count >= 2)
						return false;
				}
				if ((i + 1 < s.length() && (s.charAt(i) == 46 && s.charAt(i + 1) == 46)))
					return false;
			}
		}
		if (!(((s.charAt(s.length() - 1) >= 'a' && s.charAt(s.length() - 1) <= 'z')))) {
			return false;
		}
		if (count == 1) {
			if (!(s.charAt(c1 + 1) >= 'a' && s.charAt(c1 + 1) <= 'z') || (s.charAt(c1 - 1) == '.'))
				return false;
			for (int i = c1 + 1; i < s.length(); i++) {
				if (s.charAt(i) == '.') {
					countdot++;
					if (countdot > 2)
						return false;
				}

			}
		}

		return true;
	}
}
