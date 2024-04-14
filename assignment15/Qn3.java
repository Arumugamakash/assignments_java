package assignment15;

import java.util.ArrayList;
import java.util.Scanner;

//3. Create a class implementing a circular buffer using an ArrayList of Strings for a messaging service. This buffer should have a fixed size and overwrite the oldest element when full.
public class Qn3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> message = new ArrayList<String>();
		System.out.println("Enter the capacity");
		int capacity = sc.nextInt();
		System.out.println("How many message do u want to add");
		int noOfMsg = sc.nextInt();
		sc.nextLine();
		int index = 0;
		for (int i = 0; i < noOfMsg; i++) {//0<4
			if (i < capacity) {//0<3
				System.out.println("Enter the msg");
				message.add(sc.nextLine());//1,2,3
				continue;
			}
			index = i% capacity;
			System.out.println("Enter the msg");
			message.set(index, sc.nextLine());

		}
		System.out.println(message);
	}

}
