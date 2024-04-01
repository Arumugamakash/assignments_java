package assignment12.qn4.mainclass;

import java.util.Scanner;

import assignment12.qn4.course.Course;
import assignment12.qn4.faculty.Faculty;
import assignment12.qn4.students.Students;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course c = new Course();
		System.out.println("Enter the CourseName");
		c.setName(sc.nextLine());
		System.out.println("Enter the CourseID");
		c.setId(sc.nextInt());
		sc.nextLine();
		System.out.println(c.toString());
		Students s = new Students();
		System.out.println("Enter the name of the student");
		s.setName(sc.nextLine());
		System.out.println("Enter the Student ID");
		s.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Phone Number");
		s.setPhoneNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter the address");
		s.setAddress(sc.nextLine());
		s.setCourse(c);
		System.out.println(s.toString());
		Faculty f = new Faculty();
		System.out.println("Enter the faculty Name");
		f.setName(sc.nextLine());
		System.out.println("Enter the Faculty ID");
		f.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Phone Number");
		f.setPhoneNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter the Address");
		f.setAddress(sc.nextLine());
		f.setCourse(c);
		System.out.println(f.toString());
	}
}
