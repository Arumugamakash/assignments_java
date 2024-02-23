package Assignment4;

import java.util.Scanner;

//Write a program to print prime numbers between 1 to 30
public class Q2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
		
	}
}
