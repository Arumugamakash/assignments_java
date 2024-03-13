package assignment8;

import java.util.Scanner;

public class Checking_character_existence {
	static Scanner sc=new Scanner(System.in);
	static int index = 0;

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		System.out.println(checkingCharacter(s, ch));

	}

	public static boolean checkingCharacter(String s, char ch) {
		if (index == s.length()) {
			return false;
		} else if (s.charAt(index) == ch) {
			return true;
		} else {
			return checkingCharacter(s.substring(index + 1), ch);

		}
	}
}

//package assignment8;
//
//public class Checking_character_existence {
//	static int index=0;
//	public static void main(String[] args) {
//		String s="hello";
//		char ch='l';
//		int len=s.length();
//		System.out.println(checkingCharacter(s, ch));
//		
//	}
//	public static boolean checkingCharacter(String s, char ch) {
//		if(s.length()>=0) {
//			System.out.println(s.charAt(index));
//			if (s.charAt(index)==ch) {
//				System.out.println("iam here");
//				return true;
//			}
////			else {
//				System.out.println(s.substring(index+1));//ello
//				checkingCharacter(s.substring(index+1), ch);
////				System.out.println("nan");
////				return false;
////			}
////			index=index+1;
//			
//		}
//		//return false;
//		return false;
//		
//	}
//}
