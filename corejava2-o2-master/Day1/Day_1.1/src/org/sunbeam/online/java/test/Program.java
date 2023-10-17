package org.sunbeam.online.java.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Program {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//void accept(T t)
		//Consumer<Integer> c = element -> System.out.println(element);
		
		//Consumer<Integer> c = System.out::println;
		//list.forEach(c);
		
		list.forEach(System.out::println);
	}
	public static void main3(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main2(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main1(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ){
			element = list.get(index);
			System.out.println(element);
		}
	}
}
