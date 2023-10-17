package test;

public class Program {
	public static final int SIZE = 5;
	public static int getHashCode( int element ) {
		final int PRIME = 151;
		int result = 1;
		result = result * element +  PRIME * element;
		return result;
	}
	public static void main(String[] args) {
		for( int index = 1; index <= 200; ++ index ) {
			int number  = index;
			int hashCode = Program.getHashCode(number);
			int slot = hashCode % SIZE;
			System.out.println(number+"	"+hashCode+"	"+slot);
		}
		
	}
	public static void main3(String[] args) {
		int num1  = 123;
		int hashCode = Program.getHashCode(num1);
		int slot = hashCode % SIZE;
		System.out.println(num1+"	"+hashCode+"	"+slot);
		
		
		int num2  = 123;
		hashCode = Program.getHashCode(num2);
		slot = hashCode % SIZE;
		System.out.println(num2+"	"+hashCode+"	"+slot);
	}
	private static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while( left <= right ) {
			int mid = ( left + right ) / 2;
			if( key == arr[ mid ] )
				return mid;
			else if( key > arr[ mid ] )
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main2(String[] args) {
		int key = 10;
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		//Arrays.sort( arr );	//Note it
		int index = Program.binarySearch( arr, key );
		if( index != -1 )
			System.out.println(key+" found at index "+index);
		else
			System.out.println("Key not found");
	}
	private static int linearSearch(int[] arr, int key) {
		for( int index = 0; index < arr.length; ++ index )
		{
			if( key == arr[ index ] )
				return index;
		}
		return -1;
	}
	public static void main1(String[] args) {
		int key = 150;
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		int index = Program.linearSearch( arr, key );
		if( index != -1 )
			System.out.println(key+" found at index "+index);
		else
			System.out.println("Key not found");
	}
}