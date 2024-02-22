package assignment1;

//Write a program to print a random number
public class Q3 {
	public static void main(String[] args) {
		double random = Math.random() * 9999 + 9999;
		int randomno = (int) random;
		System.out.println(randomno);
	}
}
