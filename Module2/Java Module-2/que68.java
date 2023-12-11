package basic;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class que68 {
	public static void main(String[] args) {
		 HashMap<Integer, String> map = new HashMap<>();

	        
	        map.put(0, "Red");
	        map.put(1, "Blue");
	        map.put(2, "Green");
	        map.put(3, "Yellow");
	        map.put(4, "AppleRed");

	        
	        Set set = map.entrySet();
	        Iterator itr = set.iterator();
	        while(itr.hasNext()) {
	            Map.Entry entry = (Entry) itr.next();
	            System.out.println("value : "+entry.getValue());
	        }

	    }

}
