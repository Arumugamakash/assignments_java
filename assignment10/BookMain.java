package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
1) Add a constructor to the Book class alreday created. Write a function to add books using constructors to an array of <Book> objects, and display all the books added.
 */
class Book {
	String bookName;
	long isbn;
	String publicationYear;
	double Price;
	static String bookShape = "Rectangle";

	public Book(String bookName, long isbn, String publicationYear, double price) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", isbn=" + isbn + ", publicationYear=" + publicationYear + ", Price="
				+ Price + ", BookShape = "+bookShape +"]";
	}

}

public class BookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<Book>();
		System.out.println("Enter the Number of Books");
		int count = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter the BookName");
			String bookName = sc.nextLine();
			System.out.println("Enter the ISBN");
			long isbn = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the PublicationYear");
			String publicationYear = sc.nextLine();
			System.out.println("Enter the BookPrice");
			double price = sc.nextDouble();
			sc.nextLine();
			Book book = new Book(bookName, isbn, publicationYear, price);
			books.add(book);
		}
		System.out.println("Book Details:");
		for (Book book : books) {
			System.out.println(book);
		}

	}

}
