package p1;

public class Program {
	public static void main(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		int min = numbers[ 0 ];
		for( int index = 1; index < numbers.length; ++ index ) {
			if( numbers[ index ] < min )
				min = numbers[ index ];
		}
		System.out.println("Minimum number is	:	"+min);
	}
}
