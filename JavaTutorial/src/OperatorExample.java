public class OperatorExample {

	public static void main(String[] args) {
		int counter = 0;
		
		do{
			System.out.println(counter);
			counter = ++counter;
		}while(counter <= 10);
		
		
		System.out.println("***************");
		
		int len = 10;
		for (int i = 0; i < len; i++) {
			System.out.println(i);
		}
		
	}
}
