package assignment7;
/* Write a program with an if statement. Declare one variable inside the if block and another one outside.
 Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
 */
import java.util.Scanner;

public class Ex2 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		if (true) {
			System.out.println("Enter the VariableA");
			int variableA=sc.nextInt();
		} 
		System.out.println("Enter the variableB");
		int variableB=sc.nextInt();
		System.out.println("Outside IfBlock:"+variableB);
//		System.out.println(variableA);//compiler error
	}

}
