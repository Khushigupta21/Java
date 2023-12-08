package basic;

import java.util.Scanner;

public class que10 {
	public static void main(String[] args) {
		System.out.println("enter ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		int ascii=ch;
		System.out.println("Ascii value of "+ ch+" is "+ ascii);
	}
}
