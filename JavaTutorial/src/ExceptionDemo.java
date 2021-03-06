public class ExceptionDemo {

	public static void main (String[] args) {
	       int result = divideSafely(new String[]{"10","test"});
	       System.out.println("Output is:"+result);
	    }

	    private static int divideSafely(String[] array) {
	    	int result = 20;
	        try {
	            result = divideArray(array);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.err.println("Usage: ExceptionDemo <num1> <num2>");
	        } catch (NumberFormatException e) {
	            System.err.println("Args must be integers");
	            result = 7;
	            return result;
	        } catch (ArithmeticException e) {
	            System.err.println("Cannot divide by zero");
	        } finally {
	        	System.out.println("Executing finally....");
	        	return result;
	        }
	        
	    }

	    private static int divideArray(String[] array) {
	        String s1 = array[0];
	        String s2 = array[1];
	        return divideStrings(s1, s2);
	    }

	    private static int divideStrings(String s1, String s2) {
	        int i1 = Integer.parseInt(s1);
	        int i2 = Integer.parseInt(s2);
	        return divideInts(i1, i2);
	    }

	    private static int divideInts(int i1, int i2) {
	        return i1 / i2;
	    }

}
