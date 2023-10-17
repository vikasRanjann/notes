package test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Stream = Create + Process + Consume;
public class Program {
	public static void main(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13, 0, 1, 2 };
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	public static void main5(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13, 0, 1, 2 };
		//boolean status =  IntStream.of(arr).anyMatch(number-> number%2==1);
		boolean status =  IntStream.of(arr).allMatch(number-> number%2==1);
		System.out.println(status);
	}
	public static void main4(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13, 0, 1, 2 };
		//IntStream.of(arr).distinct().forEach(System.out::println);
		//IntStream.of(arr).sorted().forEach(System.out::println);
		//IntStream.of(arr).distinct().sorted().forEach(System.out::println);
		//IntStream.of(arr).limit(3).forEach(System.out::println);
		//IntStream.of(arr).skip(3).forEach(System.out::println);
		//IntStream.of(arr).filter(number->number % 2 == 0).forEach(System.out::println);
		IntStream.of(arr).map(number->number * 2).forEach(System.out::println);
	}
	public static void main3(String[] args) {
		IntStream.range(1, 100).forEach(System.out::println);
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
	}
	public static void main2(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13, 0, 1, 2 };
		IntStream.of(arr)
		.distinct()
		.sorted()
		.limit(3)
		.forEach( System.out::println);
		//.forEach( number -> System.out.println(number ));
	}
	public static void main1(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13, 0, 1, 2 };
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr1);
		for( int index = 0; index < 3; ++ index )
			System.out.println(arr1[ index ]);
	}
}
