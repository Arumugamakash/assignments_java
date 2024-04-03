package assignment14.qn1;

import java.util.Scanner;
//1. In the book class, add methods to prevent unauthorized modification of book information. Clue: Use login to check authorized personal while updating book details.

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Book b = new Book();
		Login login =new CheckValidate();
		System.out.println("\t\tWelcome to Library\n");

		System.out.println("Enter Book Details\n");
		System.out.println("Enter the book name");
		b.setBookName(sc.nextLine());
		System.out.println("Enter the ISBN");
		b.setIsbn(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Authorname");
		b.setBookAuthor(sc.nextLine());
		System.out.println("Enter the Count of the book");
		b.setCount(sc.nextInt());
		sc.nextLine();
		
		System.out.println(b.toString());
		System.out.println("You want to update book details\n(Yes or No)\n");
		String choice=sc.nextLine();
		if (choice.equalsIgnoreCase("Yes")) {
			System.out.println("Enter the UserName");
			String name=sc.nextLine();
			System.out.println("Enter the password");
			String password=sc.nextLine();
			if (login.checkUser(name, password)) {
				System.out.println("Enter the update book Count");
				b.setCount(sc.nextInt());
				System.out.println(b.toString());
			}
			else {
				System.out.println("Ivalid UserName");
			}
		}
		else {
			System.out.println("thankYou for using Library");
		}
	}
}
