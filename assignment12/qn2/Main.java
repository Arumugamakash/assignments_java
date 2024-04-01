package assignment12.qn2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your playing music player");
		System.out.println("\n1.CDplayer\n2.Mp3Player\n3.StreamingPlayer");
		System.out.println("\nEnter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Welcome to CdPlayer");
			Playable p1 = new Cdplayer();
			break;
		case 2:
			System.out.println("Welcome to Mp3Player");
			Playable p2 = new Mp3Player();
			break;
		case 3:
			System.out.println("Welcome to Streaming player");
			Playable p3 = new StreamingPlayer();
			break;
		}

	}
}
