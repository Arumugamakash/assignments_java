package assignment8;

/*
 *  Returns true if arrays arr1 and arr2 have the same size and each element of arr2 is exactly 1 more than the element at the same location in arr1.
Otherwise it returns false. 
 */
import java.util.Scanner;

public class AllOffByOne {
	static Scanner sc = new Scanner(System.in);
	static int i = 0;
	static boolean b = false;
	public static void main(String[] args) {
		int arr1[] = { 4, 15, 40, 99 };
		int arr2[] = { 5, 16, 41, 100 };
		System.out.println(allOffByOne(arr1, arr2));
	}
	public static boolean allOffByOne(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		} else if (arr1.length > i) {
			if (arr1[i] == (arr2[i] - 1)) {
				i = i + 1;
				b = true;
				allOffByOne(arr1, arr2);
			} else {
				b=false;
			}
		}
		return b;
	}
}
