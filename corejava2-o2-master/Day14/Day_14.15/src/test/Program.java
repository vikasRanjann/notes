package test;

import java.util.IntSummaryStatistics;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

//Stream = Create + Process + Consume;
public class Program {
	public static void main(String[] args) {
		int[] arr = {  4, 1, 13, 90, 17, 2, 0, 90, 4, 13 };
		IntSummaryStatistics ss = IntStream.of( arr ).summaryStatistics();
		System.out.println("Min	:	"+ss.getMin());
		System.out.println("Max	:	"+ss.getMax());
		System.out.println("Avg	:	"+ss.getAverage());
		System.out.println("Sum	:	"+ss.getSum());
		System.out.println("Count	:	"+ss.getCount());
	}
}
