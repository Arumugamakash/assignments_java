package assignment11;

/*
 * 2. Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() ,
 multiply() , and divide() . Implement method overloading to allow these operations for integers, doubles, and optionally, other types.
 */
class MathIOperations {
	public void calculate(int a, int b) {
		System.out.println("Add 1: " + (a + b));
	}

	public static void calculate(int a, double b) {
		System.out.println("Add 2: " + (a + b));
	}

	public void calculate(int a, float b) {
		System.out.println("Subtraction : " + (a - b));
	}

	public static void calculate(int a, short b) {
		System.out.println("Mulitiplication : " + (a * b));
	}

	public void calculate(int a, int b, int c) {
		System.out.println("Multipliation : " + (a * b * c));
	}

	public static void calculate(long a, int b) {
		System.out.println("divide : " + (a / b));
	}
}

public class MathIOperationsMain {
	public static void main(String[] args) {
		MathIOperations m1 = new MathIOperations();
		m1.calculate(20, 30);
		m1.calculate(10, 20.0);
		m1.calculate(100, 40f);
		m1.calculate(12, 20, 30);
		m1.calculate(1000, 124);
		m1.calculate(10L, 2);
	}
}
