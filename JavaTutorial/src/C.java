public class C extends B {
	String c = null;

	String name = null;

	public C(String name) {
		this.name = name;
	}
	
	public String printName(){
		return this.name;
	}

	void doB() {
		System.out.println("Who cares what B says");
	}

	void doC() {
		System.out.println("C says " + a + " " + b + " " + c);
	}
}
