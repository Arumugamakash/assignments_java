package assignment15;
/*
1.Create ArrayList of the book class (ArrayList<Book>) in main method. Add methods to add books to the ArrayList
2. Write methods to update/delete a particular book in the above ArrayList
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn1 {
	static Scanner sc = new Scanner(System.in);
	static List<Book> bookList = new ArrayList<Book>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nEnter the Option\n\n1.AddBook\n2.UpdateBook\n3.RemoveBook\n4.ShowBooks\n5.Exit");
			int option = sc.nextInt();// 1
			switch (option) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				showBook();
				break;
			case 5:
				System.out.println("thanK You");
				return;
			default:
				System.out.println("Please enter the Valued Option");
				break;
			}
		}
	}

	private static void showBook() {
		System.out.println(bookList);
	}

	private static void add() {
		System.out.println("How many book you want to add");
		int add = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < add; i++) {
			Book book = new Book();
			System.out.println("Enter the Book Details\n");
			System.out.println("Enter the Book Name");
			book.setName(sc.nextLine());
			System.out.println("Enter the Book ISBN");
			book.setIsbn(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter the Book AuthorName");
			book.setAuthor(sc.nextLine());
			System.out.println("Enter the Book Price");
			book.setPrice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter the Book Genre");
			book.setGenre(sc.nextLine());
			bookList.add(book);
		}
	}

	private static void update() {
		sc.nextLine();
		System.out.println("Enter the update Book_ISBN");
		int bookId = sc.nextInt();
		Book book = isBookPresent(bookId);
		if (book != null) {
			System.out.println("Enter the Book price");
			book.setPrice(sc.nextDouble());
		} else {
			System.out.println("Book Not Found");
		}
	}

	private static void delete() {
		sc.nextLine();
		System.out.println("Enter the Delete Book_ISBN");
		int bookId = sc.nextInt();
		Book book = isBookPresent(bookId);
		if (book != null) {
			bookList.remove(book);
		} else {
			System.out.println("Book No	t Found");
		}
	}

	private static Book isBookPresent(int id) {
		for (Book book : bookList) {
			if (book.getIsbn() == id) {
				return book;
			}
		}
		return null;
	}
}

class Book {
	private String name;
	private long isbn;
	private String author;
	private double price;
	private String genre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "BookName=" + name + ", isbn=" + isbn + ", author=" + author + ", price=" + price + ", genre=" + genre
				+ "";
	}

}
