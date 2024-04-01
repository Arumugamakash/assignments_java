package assignment12.Qn3.members;

import assignment12.Qn3.Books.Book;

public class Members {
	private String name;
	private int id;
	private long phoneNumber;
	private String address;
	private Book book;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Members [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", book=" + book + "]";
	}

	

}
