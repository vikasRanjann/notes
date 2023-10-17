package p5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Program {
	public static void main(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0,13,90 };
		
		boolean status = IntStream.of(numbers).anyMatch(number->number % 2 == 1 );
		System.out.println(status );
		
		 status = IntStream.of(numbers).allMatch(number->number % 2 == 1 );
		System.out.println(status );
	}
	public static void main1(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0,13,90 };
		
		//IntStream.range(1, 100).forEach(System.out::println);
		
		//int[] arr = IntStream.range(1, 100).toArray();
		//System.out.println(Arrays.toString(arr));
		
		List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
