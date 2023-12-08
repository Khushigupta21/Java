package basic;

class Prgoo{
	public Prgoo(){
		System.out.println("\nDivisible by 3:");
		for(int j=1;j<=100;j++) {
			if(j%3==0) {
				System.out.print(j+",");
			}
		}
		
		System.out.println("\n\nDivisible by 5");
	for(int j=1;j<=100;j++) {
		if(j%5==0) {
			System.out.print(j+",");
		}
	}
	
	System.out.println("\n\nDivisible by 3 and 5");

	for(int j=1;j<=100;j++)
	{
		if(j%3==0 && j%5==0){
			System.out.print(j+",");
		}
	}
	}
	
	
}

public class que13 {
	public static void main(String[] args) {
		new Prgoo();
}
}
