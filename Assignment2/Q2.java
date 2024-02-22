package Assignment2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the a, b,c values ​​of quadratic equation ");
		System.out.println("Enter a value");
		double a = sc.nextDouble();
		System.out.println("Enter b value");
		double b = sc.nextDouble();
		System.out.println("Enter c value");
		double c = sc.nextDouble();
		double formula = b * b - 4 * a * c;
//		System.out.println(formula);
		if (formula > 0) {
			int root1 = (int)((-b + (Math.sqrt(formula)) )/ 2 * a);
			int root2 = (int)((-b - (Math.sqrt(formula))) / 2 * a);
			System.out.println(root1);
			System.out.println(root2);
		} else if (formula == 0) {
			int root =(int)( -b / 2 * a);
			System.out.println(root);
		} else {
			System.out.println("The equation has no real root");
		}
	}
}
