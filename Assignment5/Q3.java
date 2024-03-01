package Assignment5;
//Write a program to implement matrix multiplication

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of First_Matrix");
		int m = sc.nextInt();
		System.out.println("Enter the column size of First_Matrix");
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the row size of second_Matrix");
		int o = sc.nextInt();
		System.out.println("Enter the column size of second_Matrix");
		int p = sc.nextInt();
		int b[][] = new int[o][p];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Enter the Element In first Matrix");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println("Enter the Element In Second Matrix");
				b[i][j]=sc.nextInt();
			}
		}
		if (n != o) {
			System.out.println("Matrix cannot be multiplied");
		} else {
			int ans[][] = new int[m][p];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					for (int k = 0; k < b.length; k++) {
						temp += a[i][k] * b[k][j];
					}
					ans[i][j] = temp;
					temp = 0;
				}
			}
			for (int[] is : ans) {
				//System.out.println("results");
				System.out.println(Arrays.toString(is));
			}
		}
		
		
	}
}
