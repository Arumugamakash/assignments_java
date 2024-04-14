package assignment15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//5. Write a program that sorts an ArrayList of custom objects
//based on a specific property using a custom comparator 
//class implementing the Comparator interface.
class Books {
	String bookName;
	int bookId;
	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Books(String bookName, int bookId, double price) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nBookName=" + bookName+""+"BookPrice=" + price+"\n";
	}

}

class PriceCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Books b1 = (Books) o1;
		Books b2 = (Books) o2;
		if (b1.getPrice() == b2.getPrice())
			return 0;
		else if (b1.getPrice() > b2.getPrice())
			return 1;
		else
			return -1;
	}
}

public class Qn5 {
	public static void main(String[] args) {
		List<Books> bookList = new ArrayList<Books>();
		bookList.add(new Books("Tamil", 1, 150));
		bookList.add(new Books("English", 2, 70));
		bookList.add(new Books("Maths", 4, 100));
		bookList.add(new Books("Java", 5, 200));
		Collections.sort(bookList, new PriceCompare());
		System.out.println("sort List based On price:"+bookList);
	}
}
