package Assignment2;
//Write a program to calculate a person's Body Mass Index on user input for weight and height.
import java.util.Scanner;

public class Q4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the person Weight in kg");
		double weight = sc.nextInt();
		System.out.println("Enter the person height in cm");
		double height = sc.nextInt();
		height = height / 100;
		double bmi = weight / (height * height);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normalweight");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Over_weight");
		} else {
			System.out.println("obese");
		}
		System.out.println(String.format("%.2f\n.", bmi));

	}

}
