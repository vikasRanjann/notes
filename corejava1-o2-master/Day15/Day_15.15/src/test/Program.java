package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30 );
		list.forEach(System.out::println);
	}
	public static void main4(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//Consumer<Integer> action = System.out::println;
		//list.forEach(action);
		
		list.forEach(System.out::println);
	}
	public static void main3(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//Consumer<Integer> action = number -> System.out.println(number);
		//list.forEach(action);
		
		list.forEach(number->System.out.println(number));
	}
	public static void main2(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for( int element : list ) {
			System.out.println(element );
		}
	}
	public static void main1(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for( int index = 0; index < list.size(); ++ index ) {
			int element = list.get(index);
			System.out.println(element);
		}
	}
}
