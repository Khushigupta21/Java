package basic;
class area{
	public float square(float side) {
		return side*side;
	}
	public float rectangle(float l, float b) {
		return l*b;
	}
}
public class Que9 {
	public static void main(String[] args) {
		area a=new area();
		System.out.println("Area of square is "+a.square(5));
		System.out.println("Area of Rectangle is "+ a.rectangle(5, 2));
	}
}
