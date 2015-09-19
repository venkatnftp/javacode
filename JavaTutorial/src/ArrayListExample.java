import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List myArr = new ArrayList();

		myArr.add(new Integer(10));
		myArr.add(new Integer(2));
		myArr.add(new Integer(10));

		int size = myArr.size();

		System.out.println("Size of the collection:" + size);

		//1
		for (int i = 0; i < size; i++) {
			System.out.println(i + " : " + myArr.get(i));
		}

		myArr.remove(2);

		size = myArr.size();

		System.out.println("Size of the collection after removal:" + size);

		for (int i = 0; i < size; i++) {
			System.out.println(i + " : " + myArr.get(i));
		}

		//2
		int sum = 0;
		for (Iterator iterator = myArr.iterator(); iterator.hasNext();) {
			Integer data = (Integer) iterator.next();
			System.out.println(data);
			sum = sum + data.intValue();
		}
		System.out.println(sum);
		
		//3 advanced for loop, was introduced in Java 5
		for (Object valInArr : myArr) {
			
		}
		
	}

}
