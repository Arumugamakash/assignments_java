package assignment8;
/*
 * Here, your task is to compute the square root of the number (rounded to the nearest integer)
without using in-built methods or tricks. (Hint: Use Simple Loops to compute the square root of the given number)
 */
import java.util.Scanner;

public class SquareRoot {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Input");
		int inp = sc.nextInt();//30
		int check = 0, checkprev = 0;
		for (int i = 1; i < inp; i++) {
			check = i * i;// 1
			checkprev = (i - 1) * (i - 1);
			if (check == inp) {
				System.out.println("Squart root of "+inp+" is:"+i);
				break;
			} else if (check > inp) {// 49>45
				int next = check - inp;// 4
				int prev = inp - checkprev;// 9
				if (next > prev) {//4>9
					System.out.println("Square roots of "+inp+" is:"+(i-1));
					break;
				}
			}
		}
	}
}
