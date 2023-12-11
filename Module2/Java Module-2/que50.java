package basic;
import java.util.ArrayList;
import java.util.Collections;

public class que50 {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();

	        // adding data to arraylist
	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Yellow");
	        list.add("AppleRed");

	        // to shuffle arraylist
	        Collections.shuffle(list);
	        System.out.println(list);
	}
}
