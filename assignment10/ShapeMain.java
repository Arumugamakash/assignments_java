package assignment10;
//2. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'

class Shape {
	double a;
	void area() {}
	public double getDetails() {
		return a;
	}
}

class Rectangle extends Shape {
	int length;
	int base;

	public Rectangle(int length, int base) {
		super();
		this.length = length;
		this.base = base;
	}

	void area() {
		a = length * base;
	}
}

class Circle extends Shape {
	final double pi = 3.14;
	int r;

	public Circle(int radius) {
		super();
		this.r = radius;
	}

	void area() {
		a = pi * (r * r);
	}

}

public class ShapeMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		r1.area();
		System.out.println("Rectangle Area is :"+r1.getDetails());
		Circle c=new Circle(6);
		c.area();
		System.out.println("Circle Area is :"+c.getDetails());
	}

}
