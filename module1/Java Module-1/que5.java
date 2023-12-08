package basic;

import java.util.Scanner;

public class que5 {
	public static void main(String[] args) {
		System.out.println("Enter five numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=a+b+c+d+e;
		int avg=f%5;
		System.out.println(f + "is the total of "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println("average of number is "+ avg);
		

	}
}
