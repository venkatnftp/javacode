import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetExample {
	public static void main(String[] a) {
		List set = new ArrayList();
		//set.add("test");
		set.add(new Integer(1));
		set.add(new Integer(1));
		set.add(new Integer(2));
		
		System.out.println("size is :"+set.size());
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		
		
	}
}
