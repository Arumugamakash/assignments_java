package assignment14.qn3;
/*
3. Create an abstract class named Product with methods like getPrice() and getDescription(). 
Extend the abstract class in classes representing different types of products such as ElectronicsProduct , 
ClothingProduct , and BookProduct . Display the details of products and calculate the total price in a shopping cart.
 */
public abstract class Product {
	String productName;
	String brand;
	double price;
	
	static double totalPrice=0.0;
	public Product(String productName, String brand, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}
	
	public abstract double getPrice();
	public abstract void getDescription();
	
	

}
class ClothingProduct extends Product{
	int size;
	String color;
	
	public ClothingProduct(String productName, String brand, double price, int size, String color) {
		super(productName, brand, price);
		this.size = size;
		this.color = color;
		totalPrice=totalPrice+price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void getDescription() {
		System.out.println("ProductName="+productName+"\nBrandName="+brand+"\nprice="+price+"\ncolor="+color);
	}
	
}
class BookProduct extends Product{
	String author;
	int numberOfpage;
	

	

	public BookProduct(String productName, String brand, double price, String author, int numberOfpage) {
		super(productName, brand, price);
		author = author;
		this.numberOfpage = numberOfpage;
		totalPrice=totalPrice+price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void getDescription() {
		System.out.println("ProductName="+productName+"\nAuthorName="+author+"\nBrandName="+brand+"\nprice="+price+"No of pages="+numberOfpage);		
	}
	
}
class ElectronicProduct extends Product{
	double rating;

	

	public ElectronicProduct(String productName, String brand, double price, double rating) {
		super(productName, brand, price);
		this.rating = rating;
		totalPrice=totalPrice+price;
	}

	@Override
	public double getPrice() {
		return rating;
	}

	@Override
	public void getDescription() {
		System.out.println("ProductName="+productName+"\nBrandName="+brand+"\nprice="+price+"\nRatingOf the product="+rating);
		
	}
	
	
}
