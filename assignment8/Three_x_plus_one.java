package assignment8;

/*The 3x + 1 problem is one of the most famous unsolved problems in math. You start with an integer x. If x is even, divide it by 2 and if it is odd, 
 * compute 3x + 1. Then do the same to this number, dividing it by 2 if it is even, and multiplying it by 3 and adding 1 if it is odd. Continue this process until you get a 1. 
 * For instance, x = 11 gives the sequence 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1. It is conjectured that no matter what value of x you start with, you always end up with 1, 
 * but no one can prove it. Ask the user to enter a starting value, and print out the entire sequence on one line until the first 1.*/
import java.util.Scanner;

public class Three_x_plus_one {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Input");
		int inp = sc.nextInt();//11
		System.out.print(inp+" ");
		do {
			if(inp%2!=0) {//11
				inp=3*inp+1;
				System.out.print(inp+" ");
			}
			else {
				inp=inp/2;
				System.out.print(inp+" ");
			}
		} while (inp!=1);
	}
}
