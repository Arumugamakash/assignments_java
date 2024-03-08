package assignment7;

/*Create a class Product and add appropriate instance variables with different datatypes and try printing them. 
 Note: See declaration for System.out.println method for various datatypes
 */
public class Product {
	int i = 4;
	final String A = "Akash";
	static double d = 9.0;
	boolean b;
	public static void main(String[] args) {
		Product p=new Product();
		System.out.println("int type:-"+p.i);
		System.out.println("String type:-"+p.A);
		System.out.println("double type:-"+d);
		System.out.println("boolean type:-"+p.b);
		
	}
}
