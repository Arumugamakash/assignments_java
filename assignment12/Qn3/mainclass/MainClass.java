package assignment12.Qn3.mainclass;

import java.time.LocalDate;
import java.util.Scanner;

import assignment12.Qn3.Books.Book;
import assignment12.Qn3.members.Members;
import assignment12.Qn3.transactions.Transactions;

public class MainClass {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("Welcome to Library\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Details :");
		System.out.println("Enter the BookName");
		book.setName(sc.nextLine());
		System.out.println("Enter the ISBN of the Book");
		book.setIsbn(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the BookAuthor");
		book.setAuthor(sc.nextLine());
		System.out.println("Enter the Genre of the Book");
		book.setGenre(sc.nextLine());
		System.out.println("Enter the BookCount");
		book.setAvailableCount(sc.nextShort());
		sc.nextLine();
		System.out.println(book.toString());
		System.out.println("**********************************");
		System.out.println("\nEnter Member Details :");
		Members member = new Members();
		System.out.println("Enter the MemberName");
		member.setName(sc.nextLine());
		System.out.println("Enter the MemberID");
		member.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Phone Number");
		member.setPhoneNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter the Address");
		member.setAddress(sc.nextLine());
		member.setBook(book);
		System.out.println(member.toString());
		System.out.println("\nEnter Transaction Details :");
		Transactions tran = new Transactions();
		System.out.println("Enter the Transaction ID");
		tran.setId(sc.nextInt());
		sc.nextLine();
		tran.setIssuedDate(LocalDate.now());
		tran.setMember(member);
		System.out.println(tran.toString());
	}

}
