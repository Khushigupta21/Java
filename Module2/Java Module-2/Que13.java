package basic;
import java.lang.Math;

class 	Triangle{
	 public void area(int a, int b, int c) {
	        double s = (a + b + c) / 2.0;
	        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	        System.out.println("Area of a triangle is: " + A + " sq. units");
	    }

	    public void perimeter(int a, int b, int c) {
	        System.out.println("Perimeter of a triangle is: " + (a + b + c) + " units");
	    }
}
public class Que13 {
	public static void main(String[] args) {
		Triangle tr1 = new Triangle();
        int side1 = 3, side2 = 4, side3 = 5;
        tr1.area(side1, side2, side3);
        tr1.perimeter(side1, side2, side3);	}
}


