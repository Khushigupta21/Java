package basic;

import java.util.Scanner;

public class que11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input between 0-9");
		String n=sc.next();
		if(n.matches("[0-9]")) {
		System.out.println(n+ "+"+n+n+"+"+n+n+n+"is "+ ((Integer.parseInt(n) +Integer.parseInt(n+n))+Integer.parseInt(n+n+n)));
		}
		else {
			System.out.println("Error!! Enter valid number");
		}
	}
}
