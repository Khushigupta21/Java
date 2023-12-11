package basic;
import java.util.Scanner;
class Output {
	  public void printInteger(int a, String string) {
	    System.out.println("Integer: " + a);
	    System.out.println("Character: " + string);
	  }

	  public void printCharacter(String string, int a) {
	    System.out.println("Character: " + string);
	    System.out.println("Integer: " + a);
	  }
	}

public class Que8 {
	public static void main(String[] args) {
		System.out.println("Enter two times");
		Output output = new Output();
	    Scanner input = new Scanner(System.in);

	    output.printInteger(10, input.nextLine());
	    output.printCharacter(input.nextLine(), 20);
	  }
	}