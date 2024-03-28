package assignment11.qn3;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEmployee Details\n");
		System.out.println("Enter the EmployeeName");
		String name = sc.nextLine();
		System.out.println("Enter the Employee Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Address");
		String address = sc.nextLine();
		System.out.println("Enter the Employee Contact");
		long contact = sc.nextLong();
		sc.nextLine();
		// Employee object
		Employee emp = new Employee(name, id, address, contact);
		emp.getDetails();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nSalaried Employee Details\n");
		System.out.println("Enter the EmployeeName");
		String name1 = sc.nextLine();
		System.out.println("Enter the Employee Id");
		int id1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Address");
		String address1 = sc.nextLine();
		System.out.println("Enter the Employee Contact");
		long contact1 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the EmployeeType");
		String type1 = sc.nextLine();
		/// salaried Employee object
		Employee emp1 = new SalariedEmployee(name1, id1, address, contact1, type1);
		emp1.getDetails();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nHourly Employee Details\n");
		System.out.println("Enter the EmployeeName");
		String name2 = sc.nextLine();
		System.out.println("Enter the Employee Id");
		int id2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Address");
		String address2 = sc.nextLine();
		System.out.println("Enter the Employee Contact");
		long contact2 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the EmployeeType");
		String type2 = sc.nextLine();
		/// Hourly Employee object
		Employee emp2 = new HourlyEmployee(name2, id2, address2, contact2, type2);
		emp2.getDetails();
	}

}
