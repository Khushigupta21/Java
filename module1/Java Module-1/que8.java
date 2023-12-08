package basic;

import java.util.Scanner;

public class que8 {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		long input=sc.nextLong();
		if(input>=0 && input<=9) {
			System.out.println("1 digit number");
		}
		else if(input>=10 && input<100) {
			System.out.println("2 digit number");
		}
		else if(input>=100 && input<1000){
			System.out.println("3 digit number");
		}
		else if(input>=1000 && input<10000){
			System.out.println("4 digit number");
		}
		else if(input>=10000 && input<100000) {
			System.out.println("5 digit number");
		}
		else if(input>=100000 && input<1000000) {
			System.out.println("6 digit number");
		}
		else if(input>1000000 && input<10000000) {
			System.out.println("7 digit number");
		}
		else if(input>10000000 && input<100000000) {
			System.out.println("8 digit number");
		}
		else if(input>100000000 && input<1000000000) {
			System.out.println("9 digit number");
		}
		else if(input>1000000000) {
			System.out.println("Error");
		}
		else {
			System.out.println("error");
		}
	}

}
