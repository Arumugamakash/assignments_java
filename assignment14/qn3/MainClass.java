package assignment14.qn3;

public class MainClass {
	public static void main(String[] args) {
		Product p1=new ClothingProduct("FormalShirt", "OTTO", 1000, 36, "Black");
		Product p2=new ElectronicProduct("Laptops", "HP", 30000, 4.5);
		Product p3=new BookProduct("Book", "PonniyinSelvan", 1200, "Kalki", 456);
		p1.getPrice();
		p1.getDescription();
		System.out.println("-----------------------");
		p2.getPrice();
		p2.getDescription();
		System.out.println("-----------------------");
		p3.getPrice();
		p3.getDescription();
		System.out.println("-----------------------");
		Product p = null;
		System.out.println("Total price in shoping cart="+p.totalPrice);
	}

}
