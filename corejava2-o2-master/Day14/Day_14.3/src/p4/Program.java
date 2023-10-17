package p4;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Program {
	public static void main(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0,13,90 };
		
		IntStream.of(numbers).distinct().forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).sorted().forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).limit(3).forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).skip(3).forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).distinct().filter(number->number % 2 == 0 ).forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).distinct().map(number->number * number ).forEach( number-> System.out.print(number+" "));
		System.out.println();
		IntStream.of(numbers).boxed();
	}
}
