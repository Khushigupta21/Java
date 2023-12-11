package basic;

public class Que19 {
	public static void main(String[] args) {
        Factorial(10);
    }

    static public void Factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        System.out.println(result);
    }
	
}
