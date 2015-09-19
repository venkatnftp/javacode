public class B extends A {

	String b = null;

	void doA() {
		super.doA();
		System.out.println("doA called in class B");
	}
	
	void doB() {
		System.out.println("B says " + b);
	}

}
