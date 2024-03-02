package Assignment6;

import java.util.Scanner;

///Write a program to capitalize the first letter of each words in a sentence.
public class Q5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The String");
		String s = sc.nextLine();
		String ans="";
		char ch[]=s.toCharArray();
		ans+=(char)(ch[0]-32);
		for (int i = 1; i < ch.length; i++) {
			if(ch[i]==' ') {
				ans=ans+' '+(char)(ch[i+1]-32);
				i++;
			}
			else {
				ans+=ch[i];
			}
		}
		
		System.out.println(ans);
	}
	

}
