package test.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Test Name";
		e.address = "Test Address";
		e.SSN = 11122333;
		e.number = 101;
		try {
			FileOutputStream fileOut = new FileOutputStream("c:/temp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved");
		} catch (IOException i) {
			i.printStackTrace();
		}
		System.out.println("Serialized Employee...");
		System.out.println(e);
	}
}
