import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// create an instance of HashMap to Store Phone Number
		Map exampleUserMap = new HashMap();

		// Populate example map with values
		exampleUserMap.put("Sam", 258963147);
		exampleUserMap.put("John", 5874569);
		exampleUserMap.put("Sunny", 58963147);
		exampleUserMap.put("Linda", 523658);

		System.out.println("Value**** "+exampleUserMap.get("John"));
		
		Set keys = exampleUserMap.keySet();

		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println(key+" : value for : "+exampleUserMap.get(key));
		}

	}

}
