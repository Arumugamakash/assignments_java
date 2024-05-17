package assignment17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 4. Simulate a Music Player Playlist. Create a chain of songs in LinkedList. 
 The Head points to the current song. Add a provision to add, remove songs anywhere in the playlist.
 */
public class Qn4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> song = new LinkedList<String>();
		start(song);
	}

	private static void start(Queue<String> song) {
		System.out.println(
				"\n1.View my playList\n2.AddSong\n3.Remove Song\n4.Current Playing Song\n5.Exit\nEnter Your Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			if (song.isEmpty()) {
				System.out.println("No song Added");
			} else {
				System.out.println(song);
			}
			start(song);
			break;
		case 2:
			System.out.println("Enter Your Song");
			song.add(sc.nextLine());
			System.out.println("Song Added Successsfully");
			start(song);
			break;
		case 3:
			removeSong(song);
			start(song);
			break;
		case 4:
			System.out.println("Current Playing song :" + song.peek());
			start(song);
			break;
		case 5:
			System.out.println("Than you for Using");
			break;

		default:
			break;
		}
	}

	private static void removeSong(Queue<String> song) {
		System.out.println("Enter Your deleted song name");
		String name = sc.nextLine();// anbe
		boolean flag = true;

		Iterator<String> d1 = song.iterator();
		while (d1.hasNext()) {
			if (d1.next().equals(name)) {
				d1.remove();
				System.out.println("Song has removed");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Song not found");
		}
	}
}
