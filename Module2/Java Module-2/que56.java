package basic;
import java.util.ArrayList;
import java.util.Collections;

public class que56 {
	public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");

        // Reversing the arraylist
        Collections.reverse(list);
        System.out.println(list);

}
	}