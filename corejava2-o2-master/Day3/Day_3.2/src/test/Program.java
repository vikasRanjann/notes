package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>( ); //Upcasting
		set.add("Pune");
		set.add("Nasik");
		set.add("A.nagar");
		set.add("Mumbai");
		set.forEach(System.out::println);
	}
	public static void main4(String[] args) {
		TreeSet<Integer> set  = new TreeSet<>( );
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
	
		set.forEach(System.out::println);
	}
	public static void main3(String[] args) {
		TreeSet<Integer> set  = new TreeSet<>( );
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
	
		Integer element = null;
		Iterator<Integer> itr = set.descendingIterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main2(String[] args) {
		TreeSet<Integer> set  = new TreeSet<>( );
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
	
		set.forEach(System.out::println);
	}
	public static void main1(String[] args) {
		TreeSet<Integer> set  = new TreeSet<>( );
		set.add( null ); //NullPointerException
	}
}
