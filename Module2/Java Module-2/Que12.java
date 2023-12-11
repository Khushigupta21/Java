package basic;
import java.util.Scanner;
class Rectangle{
	float length;
	float breadth;

    public Rectangle(int x, int y) {
        length = x;
        breadth = y;
    }
	public void area() {
		System.out.println(length*breadth);
	}
	public void perimeter() {
        System.out.println(2 * (length + breadth));
	}
}
class Square extends Rectangle {
		public Square(int z) {
			super(z,z);
		}
}
public class Que12 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Rectangle rectangle = new Rectangle(3, 5);
	        Square square = new Square(5);

	        rectangle.area();
	        rectangle.perimeter();
	        square.area();
	        square.perimeter();

	        scanner.close();
	}
}
