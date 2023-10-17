package test;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> set =  new HashSet< >( );
		set.add(57);
		set.add(93);
		set.add(10);
		set.add(148);
		set.add(65);
		
		set.add(57);
		set.add(93);
		set.add(10);
		set.add(148);
		set.add(65);
		
		set.add(null);
		set.forEach(System.out::println);
	}
}