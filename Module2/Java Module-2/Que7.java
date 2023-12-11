package basic;
class PrintNumber{
	public int printn(int a) {
		return a;
	}
	public float printn(int a, int b) {
		return a+b;
	}
	public double printn(int a,int b,int c) {
		return 15*2*2;
	}
	
}
public class Que7 {
	public static void main(String[] args) {
		PrintNumber a=new PrintNumber();
		System.out.println(a.printn(5));
		System.out.println(a.printn(2, 4));
	}
}
