package assignment17;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 4. Simulate a Music Player Playlist. Create a chain of songs in LinkedList.
 * The Head points to the current song. Add a provision to add, remove songs
 * anywhere in the playlist.
 */

class Song {
	String title;

	public Song(String title) {
		this.title = title;
	}
}

public class Qn4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Music Player");
		getInstance();
		init();
	}

	private static MusicPlayerPlaylist playlist;

	static MusicPlayerPlaylist getInstance() {
		if (playlist == null) {
			playlist = new MusicPlayerPlaylist();
		}
		return playlist;
	}

	public static void init() {
		System.out.println("\n 1.Add Song  \n 2.Current Song \n 3.Remove Song \n 4.View my Playlist \n 5.Exit");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			playlist.addSong();
			init();
			break;
		case 2:
			playlist.playCurrentSong();
			init();
			break;
		case 4:
			playlist.removeSong();
			init();
			break;
		case 5:
			playlist.printPlaylist();
			init();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}

class MusicPlayerPlaylist {
	Scanner sc = new Scanner(System.in);
	LinkedList<Song> playlist;
	Song currentSong;

	public MusicPlayerPlaylist() {
		playlist = new LinkedList<>();
		currentSong = null;
	}

	// add song
	public void addSong() {
		System.out.println("Enter the name of the song");
		String name = sc.nextLine();
		Song s = new Song(name);
		playlist.add(s);
		System.out.println(playlist);
		if (currentSong == null) {
			currentSong = s;
		}
		System.out.println("Song Added Successfully");
	}

	// remove song
	public void removeSong() {
		System.out.println("Enter the name of the song");
		String name = sc.nextLine();
		if (playlist.isEmpty()) {
			System.out.println("Playlist is empty.");
			return;
		}
		for (Song song : playlist) {
			if (song.title.equals(name)) {
				playlist.remove(song);
				System.out.println("Song Removed Successfully");
				return;
			}
		}

	}

	// current song
	public void playCurrentSong() {
		if (currentSong == null) {
			System.out.println("No song is currently selected.");
		} else {
			System.out.println("Playing: " + currentSong.title);
		}
	}

	// entire playList
	public void printPlaylist() {
		for (Song song : playlist) {
			System.out.println(song.title);
		}
	}
}
