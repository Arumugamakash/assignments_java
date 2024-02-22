package Assignment2;

//Write a program to convert time entered in seconds to HH:mm:ss format
import java.util.Scanner;

public class Q5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Seconds");
		int seconds = sc.nextInt();// 3600
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds));
	}

}
