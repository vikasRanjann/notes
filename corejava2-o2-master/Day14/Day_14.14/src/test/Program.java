package test;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

//Stream = Create + Process + Consume;
public class Program {
	public static void main(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		long count = IntStream.of(arr).distinct().count();
		System.out.println("Count	:	"+count);
	}
	public static void main8(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		 long count = IntStream.of(arr).count( );
		System.out.println("Count	:	"+count);
	}
	public static void main7(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		int sum = IntStream.of(arr).sum();
		System.out.println("Sum	:	"+sum);
	}
	public static void main6(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		double avg = IntStream.of(arr).average().getAsDouble();
		System.out.println("Average	:	"+avg);
	}
	public static void main5(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		IntStream.of(arr).max().ifPresent( number -> System.out.println(number));
	}
	public static void main4(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		IntStream.of(arr).min().ifPresent( number -> System.out.println(number));
	}
	public static void main3(String[] args) {
		int[] arr = {  };
		int min = IntStream.of(arr).min().getAsInt(); //NoSuchElementException
		System.out.println("Minimum number is	:	"+min);
	}
	public static void main2(String[] args) {
		int[] arr = { 4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		int min = IntStream.of(arr).min().getAsInt();
		System.out.println("Minimum number is	:	"+min);
	}
	public static void main1(String[] args) {
		int[] arr = { 4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		int min = arr[ 0 ];
		for( int index = 1; index < arr.length; ++ index ) {
			if( arr[ index ] < min )
				min  = arr[ index ];
		}
		System.out.println("Minimum number is	:	"+min);
	}
}
