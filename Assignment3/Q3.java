package Assignment3;

import java.util.Scanner;

//Create a program that takes a student's score as input and outputs their corresponding grade.
public class Q3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Student Mark in(between the range (1-100)");
		int mark = sc.nextInt();
		if(mark>100){
			System.out.println("MArk is InVallid");
		}
		else if (mark >= 90) {
			System.out.println("'O' grade");
		} else if (mark > 80 && mark < 90) {
			System.out.println("'A+' grade");
		} else if (mark > 70 && mark <= 80) {
			System.out.println("'A-' grade");
		} else if (mark > 60 && mark <= 70) {
			System.out.println("'B+' grade");
		} else if (mark >= 45 && mark <= 60) {
			System.out.println("'c' grade");
		} else if (mark < 45) {
			System.out.println("Fail");
		}
	}

}
