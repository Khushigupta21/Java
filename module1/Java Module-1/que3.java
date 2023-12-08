package basic;

import java.util.Scanner;

public class que3 {
@SuppressWarnings("resource")
public static void main(String[] args) {
	System.out.println("Enter Year");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if(year%2==0) {
		System.out.println(year+" is Leap Year");
		
	}
	else {
		System.out.println("Year is not Leap");
	}
}
}
