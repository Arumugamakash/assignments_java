package assignment15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//4. Write a program that compares the performance of different 
//operations on ArrayLists with different capacities and data access patterns (random access vs. sequential access)
public class Qn4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) {
			list.add(i);
		}
		long start = System.nanoTime();
		for (int i = 0; i < list.size(); i++) {
		}
		long end = System.nanoTime();
		long randomAccessTime = end - start;
		System.out.println("ForLoop - > Random access time: " + randomAccessTime + " nanoseconds");

		start = System.nanoTime();
		for (Integer temp : list) {
		}
		end = System.nanoTime();
		long sequentialAccessTime = end - start;
		System.out.println("Enhanced For- > Sequential access time: " + sequentialAccessTime + " nanoseconds");
	}
}
