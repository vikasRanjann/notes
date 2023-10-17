package p3;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Program {
	public static void main(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0,13,90 };
		
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		IntStream.of(numbers).sorted().distinct().limit(3).forEach(System.out::println);
		
	}
	public static void main3(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0,13,90 };
		
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		IntStream.of(numbers).sorted().distinct().forEach(System.out::println);
		
	}
	public static void main2(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		IntStream.of(numbers).sorted().forEach(System.out::println);
		
	}
	public static void main1(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		Arrays.sort(copy);
		
		for( int index  = 0 ; index < copy.length; ++ index )
			System.out.print( copy[ index ] +" ");
	}
}
