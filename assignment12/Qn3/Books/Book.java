package assignment12.Qn3.Books;

public class Book {
	private String name;
	private int isbn;
	private String genre;
	private String author;
	private short AvailableCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public short getAvailableCount() {
		return AvailableCount;
	}

	public void setAvailableCount(short availableCount) {
		AvailableCount = availableCount;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", genre=" + genre + ", author=" + author + ", AvailableCount="
				+ AvailableCount + "]";
	}

	

}
