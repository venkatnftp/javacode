package test.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ApartmentComplex {
	public static void main(String[] args) {
		//numbers are key
		//Strings are values
		HashMap mailBox = new HashMap();
		ArrayList apt1 = new ArrayList();
		apt1.add("John");
		mailBox.put(1, apt1);
		
		ArrayList apt2 = new ArrayList();
		apt2.add("John W");
		apt2.add("Thompson ");
		mailBox.put(2, apt2);
		
		
		ArrayList apt3 = new ArrayList();
		apt3.add("John W");
		apt3.add("Thompson ");
		mailBox.put(3, apt3);
		
		System.out.println("Number of apartments occupied "+mailBox.size());
		
		ArrayList data =	(ArrayList)mailBox.get(2);
		for (Iterator iterator = data.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
}
