package basic;

import java.util.Scanner;

public class que2 {
	public static void main(String[] args) {
		System.out.println("Enter any single character");

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'|| ch=='A'|| ch=='E' || ch=='I'|| ch=='O'|| ch=='U') {
			System.out.println("Charcter is Vowel");
		}
		else if(ch=='0' && ch=='9') {
			System.out.println("Entered Characyer is number!!");
		}
		else if(length(ch)<1) {
			System.out.println("Syntex Error");
		}
		else {
			System.out.println("ERror");
		}
		
	}

	private static int length(char ch) {
		// TODO Auto-generated method stub
		return 0;
	}
}
