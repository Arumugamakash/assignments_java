package assignment12.qn2;

import java.util.Scanner;

public class Cdplayer implements Playable {
	Scanner sc = new Scanner(System.in);

	public Cdplayer() {
		start();
	}

	private void start() {

		System.out.println("\n CDplayer options\n");
		System.out.println("1.play   2.pause    3.stop   4.Exit/n Enter your choise:\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			play();
			start();
			break;
		case 2:
			pause();
			start();
			break;
		case 3:
			stop();
			start();
			break;
		case 4:
			System.out.println("Thank You");
			break;
		}
	}

	@Override
	public void play() {
		System.out.println("Song is PLAYING");
	}

	@Override
	public void pause() {
		System.out.println("Song is PAUSED");

	}

	@Override
	public void stop() {
		System.out.println("Song is STOPPED");

	}

}
