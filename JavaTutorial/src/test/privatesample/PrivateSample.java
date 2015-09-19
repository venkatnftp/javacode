package test.privatesample;

public class PrivateSample {
	private void sayHello(){
		System.out.println("Say Hello from Private class");
	}
	
	public static void main(String[] args) {
		PrivateSample ps = new PrivateSample();
		ps.sayHello();
		
	}
}
