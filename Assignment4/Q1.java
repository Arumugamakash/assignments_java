package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

/*1. Write a function to return index in which the given number occurs for the second time in an array, -1 if not present for the second time.
Input:
Array: [2,3,4,2,8,7]
Number: 2

Output: 3*/
public class Q1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Element");
			arr[i] = sc.nextInt();
		}
		out: for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
				if (count == 2) {
					System.out.println(i);
					break out;
				}
			}

		}
		if (count < 2) {
			System.out.println(-1);
		}

	}

}
