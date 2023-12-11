package basic;

public class que27 {
	public static void main(String[] args) {
		try {
            // command line argument into numbers
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

            // division
            double result = num1 / num2;

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
