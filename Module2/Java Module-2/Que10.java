package basic;
class class1{
	public void alpha () {
		System.out.println("This is Parent class");
	}
}
class class2 extends class1{
	public void beta() {
		System.out.println("This is Child Class");
	}
	
}

public class Que10 {
	public static void main(String[] args) {
		class2 a=new class2();
		a.beta();
		a.alpha();
	}
}
