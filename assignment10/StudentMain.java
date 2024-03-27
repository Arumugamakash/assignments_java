package assignment10;

import java.util.Scanner;

/*
 * 3. Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters.
Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
 */
class Student {
	String name;
	int age;
	char grade;

	public Student(String name, int age, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

}

class ZSGSStudent extends Student {
	String address;
	long phoneNumber;

	public ZSGSStudent(String name, int age, char grade, String address, long phNo) {
		super(name, age, grade);
		this.address = address;
		this.phoneNumber = phNo;
	}

	@Override
	public String toString() {
		return "ZSGSStudent [address=" + address + ", phoneNumber=" + phoneNumber + ", name=" + name + ", age=" + age
				+ ", grade=" + grade + "]";
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name = sc.nextLine();
		System.out.println("Enter the Student Age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student grade");
		char grade = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter the Address");
		String address = sc.nextLine();
		System.out.println("Enter the PhoneNumber");
		long phNo = sc.nextLong();
		ZSGSStudent zsgs = new ZSGSStudent(name, age, grade, address, phNo);
		System.out.println(zsgs);
	}
}
