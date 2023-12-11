package basic;
import java.util.HashSet;
public class Que61 {
	public static void main(String[] args) {
		 HashSet<Integer> set=new HashSet<>();

	        set.add(0);
	        set.add(1);
	        set.add(2);
	        set.add(3);


	        Integer[] arr=set.toArray(new Integer[0]);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]+ " ");
	        }
	}
}
