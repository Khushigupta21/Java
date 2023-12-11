package basic;
import java.util.Scanner;
class Complex{
	public void sum(float a, float b) {
		System.out.println("Sum is "+ (a+b)); 
	}
	public void diff(float a, float b) {
		System.out.println("Difference is " + (a-b));
	}
	public void product(float a, float b) {
		System.out.println("Product is "+(a*b));
	}
}
public class Que14 {
	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		Complex c=new Complex();
		c.sum(a, b);
		c.diff(a,b);
		c.product(a,b);
		
	}
}
