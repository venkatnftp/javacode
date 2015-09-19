public class StringBuilderConcatenationTest {

	public static void main(String args[]) {
		invokeUsingOption1();
		invokeUsingOption2();
	}

	private static void invokeUsingOption2() {
		final int count = 10;
		String str = new String();
		for (int i = 0; i < count; i++) {
			str = str + i + " , ";
		}
		System.out.println("Option2: "+str);
		
	}

	private static void invokeUsingOption1() {
		final int count = 10;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(i + " , ");
		}
		System.out.println("Option1: "+sb.toString());
	}

}
