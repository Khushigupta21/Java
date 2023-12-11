package basic;

public class Que26 {
	public static void main(String[] args) {
		 try {
	            int[] a = new int[5];
	            a[5] = 30 / 2;
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
