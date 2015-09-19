import java.lang.*;

public class ObjectExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectExample obj = new ObjectExample();
		System.out.println(new ObjectExample().toString());
		
		
		ObjectExample obj1 = new ObjectExample();
		System.out.println("HashCode for object 1 is "+obj1.hashCode() + " : "+obj1.toString());
		ObjectExample obj2 = new ObjectExample();
		System.out.println("HashCode for object 2 is "+obj2.hashCode()+ " : "+obj2.toString());
		
	}

	@Override
	public int hashCode() {
		return 1;
	}

	
	

}
