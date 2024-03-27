package assignment10;

import java.util.Scanner;

// 4)Create Vehicle Hierarchy
abstract class Vehicle {
	String name;
	int number;
	short seatingCapacity;

	abstract void run();

	public void showDetails() {
		System.out.println("Vechicle name is:-" + name);
		System.out.println("Vechicle number is:-" + number);
		System.out.println("Vechicle seatCapacity is:-" + seatingCapacity);
	}
}

class Train extends Vehicle {

	public Train(String name, int number, short seatingCapacity) {
		this.name = name;
		this.number = number;
		this.seatingCapacity = seatingCapacity;
	}

	void run() {
		System.out.println("Train is running");
	}

}

class Cycle extends Vehicle {
	public Cycle(String name, int number, short seatingCapacity) {
		this.name = name;
		this.number = number;
		this.seatingCapacity = seatingCapacity;
	}

	void run() {
		System.out.println("cycle is running");
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Train Name");
		String trainName = sc.nextLine();
		System.out.println("Enter the Train Number");
		int trainNumber = sc.nextInt();
		System.out.println("Enter the Train seatCapacity");
		short trainSeat = sc.nextShort();
		sc.nextLine();
		Train t = new Train(trainName, trainNumber, trainSeat);
		System.out.println("Enter the Cycle Name");
		String cycleName = sc.nextLine();
		System.out.println("Enter the Cycle Number");
		int cycleNumber = sc.nextInt();
		System.out.println("Enter the Cycle seatCapacity");
		short cycleSeatCapacity = sc.nextShort();
		t.run();
		t.showDetails();
		System.out.println("*****************");
		Cycle c = new Cycle(cycleName, cycleNumber, cycleSeatCapacity);
		c.run();
		c.showDetails();

	}

}
