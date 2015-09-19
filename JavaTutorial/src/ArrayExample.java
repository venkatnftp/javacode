
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		
		int[] array = new int[20];
		array[0] = 1;
		array[1] = 2;
		array[5] = 5;
		//array[20] = 20;
		
		System.out.println("Value of 5th element:"+array[5]);
		System.out.println("Value of 6th element:"+array[6]);
		
		String[] strArray = new String[5];
		System.out.println(strArray[0]);
		
		int[] array2 = new int[]{1,2,3};
		System.out.println(array2.length);
		//array2[4] = 4;
	}
	
	class InnerClassExample{
		
	}

}
