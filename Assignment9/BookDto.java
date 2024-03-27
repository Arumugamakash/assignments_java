package Assignment9;

class BookDto {

	private String bookName;
	private long isbn;
	private String publicationYear;
	private double Price;
	private static String bookShape = "Rectangle";

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public static String getBookShape() {
		return bookShape;
	}

	public void getDetails() {
		System.out.println("Book Details:\n\n" + "BookName:" + getBookName() + "\n\nBook ISBN number:" + getIsbn()
				+ "\n\nBook PublisingYear:" + getPublicationYear() + "\n\nBook Price:" + getPrice() + "\n\nBook shapes:"
				+ getBookShape());
	}
}
