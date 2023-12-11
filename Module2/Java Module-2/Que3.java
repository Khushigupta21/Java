package basic;

public class Que3 {
	public static void main(String[] args) {
		String a="topsint.com";
		String b="Topsint.com";
		String c="topsint.com";
		 // Compare a and c for content equality and print the result.
		System.out.println("Comparing "+a +" and "+c + ":" + a.contentEquals(c));
		 // Compare a and b for content equality and print the result.
		System.out.println("Comparing "+a + " and "+ b + " :"+ a.contentEquals(b));
	}
}
