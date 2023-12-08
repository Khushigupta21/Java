package basic;
import java.util.Scanner;

public class que1 {
	public static void main(String[] args) {
		System.out.println("Enter three values");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		if(a>b) {
			System.out.println("Output is "+ a);
		}
		else if(c>b){
			System.out.println( "Output is "+c);
		}
		else {
			System.out.println("Output is "+ b);
		}
	}
}
