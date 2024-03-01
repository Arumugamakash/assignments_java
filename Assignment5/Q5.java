package Assignment5;

import java.util.Scanner;

/*
 Initialize a jagged array with N rows with weights of N persons. Each person can have different number of weights. Write
      (i) A function to enter the weight of any user at any time.
      (ii) A function to calculate the minimum weight of the nth person.
 */
public class Q5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the no of persons");
		int noOfPerson = sc.nextInt();
		int[][] persons = new int[noOfPerson][];
		int[] minWeight = new int[noOfPerson];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Enter the no of weights for the Person" + (i + 1));
			int noOfWeight = sc.nextInt();
			persons[i] = new int[noOfWeight];
			for (int j = 0; j < persons[i].length; j++) {
				System.out.println("Enter the weights of the person " + (i + 1));
				persons[i][j] = sc.nextInt();
				if (persons[i][j] < min)
					min = persons[i][j];
			}
			minWeight[i] = min;
			min = Integer.MAX_VALUE;
		}
		System.out.println("Enter the nth person whose minimum weight needs to be displayed ");
		int n = sc.nextInt();
		for (int i = 0; i < minWeight.length; i++) {
			if (i + 1 == n)
				System.out.println("The minimum weight of the person " + n + " is" + minWeight[i]);
		}

	}
}
