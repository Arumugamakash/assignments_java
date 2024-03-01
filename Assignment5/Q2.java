package Assignment5;

//Write a program to find transpose of a matrix
import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				ans[j][i] = arr[i][j];
			}
		}
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}
	}
}
 