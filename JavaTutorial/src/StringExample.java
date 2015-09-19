
public class StringExample {
	public static void main(String[] args) {
		String name = "Rakesh Reddy";
		name = name + "123 Sw RD";
		name = name + "OR 97006";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Rakesh Reddy");
		buffer.append("123 SW RD");
		
		buffer.toString();
	}
}
