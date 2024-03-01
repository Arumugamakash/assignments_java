package Assignment5;
// Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int arr[][] = new int[len][len];
		int start = 1, end = len * len;
		int top = 0, left = 0, right = len - 1, bottom = len - 1, i = 0, j = 0, count = 0;
		while (start <= end) {
			arr[i][j] = start++;
			if (i <= bottom && count == 0) {
				if (i == bottom) {
					left++;
					count++;
					j++;
				} else {
					i++;
				}
			} else if (j <= right && count == 1) {
				if (j == right) {
					bottom--;
					count++;
					i--;
				} else {
					j++;
				}
			} else if (i >= top && count == 2) {
				if (i == top) {
					right--;
					count++;
					j--;
				} else {
					i--;
				}
			} else if (j >= left && count == 3) {
				if (j == left) {
					top++;
					i++;
					count = 0;
				} else {
					j--;
				}
			}
		}
		for (int n = 0; n < len; n++) {
			for (int m = 0; m < len; m++) {
				System.out.print(arr[n][m] + " ");
			}
			System.out.println();
		}
	}
}