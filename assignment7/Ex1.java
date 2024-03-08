package assignment7;
//.Write a program that calculates the average weight of 10 people. 
//Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.
import java.util.Scanner;

public class Ex1 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		int weight = 0 ;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the person weight");
			weight=weight+sc.nextInt();
		}
		weight=weight/10;
		float kg=weight;
		System.out.println("Average Weight of 10 people is:"+kg+" kg");
	}
}
