package p2;

import java.util.IntSummaryStatistics;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Program {
	public static void main(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		IntSummaryStatistics ss = IntStream.of(numbers).summaryStatistics();
		
		System.out.println("Min	:	"+ss.getMin());
		
		System.out.println("Max	:	"+ss.getMax());
		
		System.out.println("Sum	:	"+ss.getSum());
		
		System.out.println("Average	:	"+ss.getAverage());
		
		System.out.println("Count	:	"+ss.getCount());
	}
	public static void main6(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		IntStream.of(numbers).min().ifPresent(System.out::println); //OK
		IntStream.of(numbers).max().ifPresent(System.out::println); //OK
		
		int sum = IntStream.of(numbers).sum();
		System.out.println("Sum	:	"+sum);
		
		double average = IntStream.of(numbers).average().getAsDouble();
		System.out.println("Average	:	"+average);
		
		long count =  IntStream.of(numbers).count();
		System.out.println("Count	:	"+count);
	}
	public static void main5(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		
		IntStream.of(numbers).min().ifPresent(System.out::println); //OK
	}
	public static void main4(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		
		IntStream.of(numbers).min().ifPresent(number->System.out.println("Minimum number is "+number)); //OK
	}
	public static void main3(String[] args) {
		int[] numbers = new int[ ] {  };
		
		IntStream.of(numbers).min().ifPresent(number->System.out.println("Minimum number is "+number)); //OK
		
	}
	public static void main2(String[] args) {
		int[] numbers = new int[ ] {  };
		
		int min = IntStream.of(numbers).min().getAsInt(); //NoSuchElementException
		
		System.out.println("Minimum number is	:	"+min);
	}
	public static void main1(String[] args) {
		int[] numbers = new int[ ] { 4, 1, 13, 90, 16, 2, 0 };
		
		int min = IntStream.of(numbers).min().getAsInt();
		
		System.out.println("Minimum number is	:	"+min);	//0
	}
}
