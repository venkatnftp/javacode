public class Sum {

	int a;
	int b;
	int c;

	Sum() {
		System.out.println("default constructor");
	}

	Sum(int num1, int num2) {
		this();
		System.out.println("constructor with 2 fields");
		a = num1;
		b = num2;
	}

	Sum(int num1, int num2, int num3) {
		this(num1, num2);
		System.out.println("constructor with 3 fields");
		c = num3;
	}

	public static void main(String[] args) {
		Sum sum = new Sum(1, 2);
		System.out.println(sum.add());
		sum = new Sum(1, 2, 3);
		System.out.println(sum.add());

	}

	public int add() {
		return a + b + c;
	}
}
