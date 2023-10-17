package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		
		Set<Integer> set = new TreeSet<>(list);
		list.clear();
		list.addAll(set);
		list.forEach(System.out::println);
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.sort(null);
		list.forEach(System.out::println);
	}
}
