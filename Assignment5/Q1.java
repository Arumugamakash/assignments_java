package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

// Create a program that rotates the elements of an array to the right by a specified number of positions. 
//Get the array and the rotation count from the user

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4 };
		int ans[] = new int[arr.length];
		System.out.println("Enter the rotation Count");
		int count = sc.nextInt();// 2
		int temp = 0;
		while (count > 0) {
			for (int i = 1, m = 0; i < ans.length; i++) {
				temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
			}
			count--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
