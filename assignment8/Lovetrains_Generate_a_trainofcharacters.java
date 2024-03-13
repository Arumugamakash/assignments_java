package assignment8;

import java.util.Scanner;

/*
 * Write a program that asks the user to enter a word with an odd number of letters and then prints out a string where the middle letter
 *is printed once, the letters next to the middle are printed twice, the letters next to them are printed three times,
 *etc. all in the order given by the original word. 
 */
public class Lovetrains_Generate_a_trainofcharacters {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Input_String in odd Number");
		String inp = new String(sc.next());// red
		int middle = inp.length() / 2;//2
		int tempmid = middle + 1;

		String ans = "";

		for (int i = 0; i < inp.length(); i++) {
			if (i < middle) {
				String s = "" + inp.charAt(i);
				ans += s.repeat(tempmid);// 2
				tempmid--;
			} else if (i > middle) {
				String s = "" + inp.charAt(i);
				ans += s.repeat(tempmid + 1);
				tempmid++;
			} else {
				ans += inp.charAt(i);
			}
		}
		System.out.println(ans);

	}

}
