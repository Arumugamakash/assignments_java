package assignment11;

abstract class Shapes {
	double a;

	abstract void area();

	public double showDetails() {
		return a;
	}
}

class Rectangle extends Shapes {
	int length;
	int base;

	public Rectangle(int length, int base) {
		this.length = length;
		this.base = base;
	}

	@Override
	void area() {
		a = length * base;
	}

}

class Circle extends Shapes {
	final double pi = 3.14;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		a = pi * (radius * radius);
	}
}

public class ShapesMain {
	public static void main(String[] args) {
		Shapes s1 = new Rectangle(10, 10);
		s1.area();
		System.out.println("Rectangle area is:- "+s1.showDetails());
		s1 = new Circle(6);
		s1.area();
		System.out.println("Area of the circle is:- "+s1.showDetails());
	}

}
