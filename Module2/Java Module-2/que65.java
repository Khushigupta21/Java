package basic;


import java.util.ArrayList;
public class que65 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        //  replacing the second element using set method
        list.set(1,"changed");
        System.out.println(list);
    
	}
}
