package basic;
import java.util.Scanner;

public class Que23 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter a number: ");
	            int number = scanner.nextInt();

	            System.out.println("You entered: " + number);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            System.out.println("This block will always be executed.");
	        }

	    }
	
}
