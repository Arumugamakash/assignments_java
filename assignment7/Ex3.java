package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//In the BMI calculator program done in Java Assignment 2, write methods to get height and weight for 2 or more persons and compare their BMIs.
public class Ex3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number of persons to compare");
		int person = sc.nextInt();// 3
		String[][] persons = new String[person + 1][3];
		System.out.println(persons.length);
		persons[0][0] = "NAME";
		persons[0][1] = "BMI";
		persons[0][2] = "REMARK";
		for (int i = 1; i <= person; i++) {
			System.out.println("Enter the Name of person " + i);
			String personName = sc.next();
			System.out.println("Enter the person Weight in kg");
			double weight = sc.nextDouble();
			System.out.println("Enter the person height in cm");
			double height = sc.nextDouble();
			height = height / 100;
			double bmi = weight / (height * height);
			String person_bmi = String.format("%.2f\n", bmi);
			String remark = checkRemark(bmi);
			persons[i][0] = personName;
			persons[i][1] = person_bmi;
			persons[i][2] = remark;

		}
		for (int j = 1; j < persons.length; j++) {
			for (int i = 1; i < persons.length - 1; i++) {
				if (Double.parseDouble(persons[i][1]) < Double.parseDouble(persons[i + 1][1])) {
					String[] temp = persons[i];
					persons[i] = persons[i + 1];
					persons[i + 1] = temp;
				}
			}
		}
		for (String[] s : persons) {
			System.out.println(Arrays.toString(s));
		}

	}

	public static String checkRemark(double bmi) {
		if (bmi < 18.5) {
			return "u";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal";
		} else if (bmi >= 25 && bmi < 30) {
			return "Over weight";
		} else {
			return "Obese";
		}

	}

}
//System.out.print(persons[0][0]+"           ");
//System.out.print(persons[0][1]+"       ");
//System.out.print(persons[0][2]+"               ");
//System.out.println();
//for (int i = 1; i < persons.length; i++) {
//	for (int j = 0; j < persons[i].length; j++) {
//		if (j==0) {
//			System.out.println(persons[i][j]+s);
//		}
//		//System.out.print(persons[i][j]+"     ");
//	}
//	System.out.println();
//}
