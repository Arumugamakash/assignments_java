package assignment11;

import java.util.Scanner;

abstract class vehicle {
	int number;
	String name;
	int seatCapacity;

	public vehicle(int number, String name, int seat) {
		super();
		this.number = number;
		this.name = name;
		this.seatCapacity = seat;
	}

	abstract public void start();

	abstract public void stop();

	abstract public void show();

}

class Bus extends vehicle {
	double price;

	public Bus(int number, String name, int seat, double price) {
		super(number, name, seat);
		this.price = price;
	}

	public void show() {
		System.out.println("\nBusName: " + name + "\nBusNumber: " + number + "\nSeatCapacity: " + seatCapacity
				+ "\nBusprice: " + price);
	}

	@Override
	public void start() {
		System.out.println("Bus Started now");
	}

	@Override
	public void stop() {
		System.out.println("Bus stoped");
	}
}

class Car extends vehicle {
	double price;

	public Car(int number, String name, int seat, double price) {
		super(number, name, seat);
		this.price = price;
	}

	@Override
	public void start() {
		System.out.println("Car Started now");
	}

	@Override
	public void stop() {
		System.out.println("Car stoped");
	}

	public void show() {
		System.out.println("\nCar name: " + name + "\ncar number: " + number + "\nSeat capacity: " + seatCapacity
				+ "\nCar price: " + price);
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		vehicle vehicle=new Car(7781,"Thar", 4, 1000000);
		vehicle.start();
		vehicle.show();
		vehicle.stop();
		vehicle=new Bus(2345, "National", 55, 2000000);
		vehicle.start();
		vehicle.show();
		vehicle.stop();
	}

}
