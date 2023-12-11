package basic;
import java.util.Scanner;
public class Que24 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	      
	        try {
	            System.out.println("Enter two number");
	            int num1 = in.nextInt();
	            int num2 = in.nextInt();
	            System.out.println(num1 / num2);
	        } catch (ArithmeticException e) {
	            e.printStackTrace();
	        }
	    }
	}
